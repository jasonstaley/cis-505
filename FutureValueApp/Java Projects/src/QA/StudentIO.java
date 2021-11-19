package QA;

import java.io.File;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Deepa
 * class StudentIO has methods findAll(),insert(Student s),getString() and isNotNumber(String s)
 *
 */
public class StudentIO {

	private static ArrayList<Student> studentList = new ArrayList<>(); //Array list to store the data

	//private static String FILE_NAME = ".\\src\\GradeBookApp\\grades.csv";
	private static String FILE_NAME = ".\\src\\QA\\grades.csv";
	private static File file = new File(FILE_NAME);

	
	
	/**
	 * @return List<Student>
	 * @throws Exception
	 * this method scans the CSV file and store the data in Array list
	 * the array list is returned if the view button is pressed
	 */
	static List<Student> findAll() throws Exception { 
		Scanner input = new Scanner(file);
		ArrayList<Student> sList = new ArrayList<>();   
		while (input.hasNextLine()) {

			String[] std = new String[4];
			String[] token = input.next().split("/n");

			for (int i = 0; i < token.length; i++) {
				String[] student = token[i].split(",");
				for (int j = 0; j < student.length; j++) {
					std[j] = student[j];
				}

				Student s = new Student(std[0], std[1], std[2], std[3]);
				// System.out.println(s.toString());
				sList.add(s);

			}
		}
		input.close();

		return sList;
	}

	/**
	 * @param s-student
	 * @throws Exception
	 * this method does two data storage jobs
	 *  one to add the student object to the private Arraylist-studentList
	 * two it add the information to the CSV file and creates one if it doesn't exist.
	 */
	static void insert(Student s) throws Exception {

		studentList.add(s);

		String fileHeader = "First_Name,Last_Name,Course,Grades";
		String deLimiter = ",";
		String newLineTag = "\n";

		PrintWriter output = null;

		if (!file.exists()) {
			output = new PrintWriter(file);
			output.print(fileHeader);

		} else {
			output = new PrintWriter(new FileOutputStream(file, true));

		}
		output.print(newLineTag);
		output.print(s.getFirstName());
		output.print(deLimiter);
		output.print(s.getLastName());
		output.print(deLimiter);
		output.print(s.getCourse());
		output.print(deLimiter);
		output.print(s.getGrade());
		output.close();

	}

	/**
	 * @param one
	 * @param two
	 * @param three
	 * @param four
	 * @return boolean
	 * this acts as a validation method for the input values
	 * numbers, blank fields and special characters are rejected and not saved
	 * the user is prompted with an error message.
	 * 
	 */
	public static boolean getString(String one, String two, String three, String four) {
		boolean isValid = false;
		
		//condition 1 is to check if there is no blank field or no null
		
		boolean condition1=((!one.isBlank() && !two.isBlank() && !three.isBlank() && four != null));
		//condition 2 is to make sure the string has no numbers or characters
		
		boolean condition2=((isNotNumber(one) && isNotNumber(two)  && isNotNumber(three) ));
		
		
		//if no blank and no numbers and no special characters in the field then the data is saved as student object
		if (condition1 && condition2)  {

			
			System.out.println(isNotNumber(one));
			
				isValid = true;
			

		} else {
			isValid = false;
			//error message pops up , Error if :Blank field/ Numbers/special characters
			BorderPane pane = new BorderPane();
			pane.setPadding(new Insets(5, 5, 5, 5));
			Text text1 = new Text(20, 20, " Error :Blank field/ Numbers/special characters - not accepted !");
			text1.setFont(Font.font("Courier", FontWeight.MEDIUM, FontPosture.REGULAR, 15));
			pane.setCenter(text1);
			Button closeButton = new Button("Close");
			pane.setBottom(closeButton);

			Stage stage = new Stage();

			Scene scene = new Scene(pane, 500, 80);
			stage.setScene(scene);

			closeButton.setOnAction(e -> {

				stage.close();

			});
			stage.show();

		}

		return isValid;

	}

	/**
	 * @param s
	 * @return boolean
	 * this method is used inside the getString(str,str,str,str), to check the condition 2
	 * if there is no number or special characters in the input value this method returns true
	 * 
	 */
	private static boolean isNotNumber(String s) {
		boolean num = true;
		char[] characters = s.toCharArray();
		for (char c : characters) {
			if (!Character.isLetter(c) && (!Character.isWhitespace(c)) ) {
				//if (!Character.isWhitespace(c)) {
				//System.out.println(c + "" + !Character.isLetter(c));
				num = false;
			}
		}
		return num;

	}
}