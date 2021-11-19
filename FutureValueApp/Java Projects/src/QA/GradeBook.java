package QA;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Deepa
 * This class is the GUI part 
 * has  fields and start() methods
 * Start method holds the action even for clear, save and view* 
 * 
 *
 */
public class GradeBook extends Application {

	// labels.combobox and text fields

	private Label firstName = new Label("First Name");
	private Label lastName = new Label("Last Name");
	private Label course = new Label("Course");
	private Label grade = new Label("Grade");

	private Button btnClear = new Button("Clear");
	private Button btnSave = new Button("Save");
	private Button btnView = new Button("View");
	private ComboBox<String> listBox = new ComboBox<>();

	private TextField fName = new TextField();
	private TextField lName = new TextField();
	private TextField cName = new TextField();

	@Override
	public void start(Stage primaryStage) throws Exception {

		// create boarder pane for holding top and bottom panes

		BorderPane bPane = new BorderPane();
		bPane.setTop(TopPane());// top pane hold the labels and text fields
		bPane.setBottom(bottomPane());// Bottom pane hold the bottom and the action event

		//// Action Event Lambda expression to view

		btnView.setOnAction(e -> {

			GridPane pane = new GridPane();
			try {
				java.util.List<Student> student = StudentIO.findAll();
				int i = 0;
				for (Student s : student) {

					Text s1 = new Text(s.getFirstName());// thought the requirement is to use tostring from student
															// class
					Text s2 = new Text(s.getLastName());// I preferred this grid style for proper spacing on the view
														// screen
					Text s3 = new Text(s.getCourse());
					Text s4 = new Text(s.getGrade());

					pane.add(s1, 1, i);
					pane.add(s2, 2, i);
					pane.add(s3, 3, i);
					pane.add(s4, 4, i++);

				}

				Stage stage2 = new Stage();
				Scene scene2 = new Scene(pane, 400, 450);
				stage2.setTitle("Grades_Display");
				stage2.setScene(scene2);
				stage2.show();
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		});

		// // Action Event lambda expression to clear the form
		btnClear.setOnAction(e -> {
			fName.clear();
			lName.clear();
			cName.clear();
			listBox.getSelectionModel().clearSelection();

		});

		// // Action Event lambda expression to save the entry
		btnSave.setOnAction(e -> {
			Student student = null;

			{
				String firstName = fName.getText();
				String lastName = lName.getText();
				String courseName = cName.getText();
				String grade = listBox.getValue();
				if (StudentIO.getString(firstName, lastName, courseName, grade))//validation point for the input values
					student = new Student(firstName, lastName, courseName, grade);//if validation passes-student object is created.

				try {

					StudentIO.insert(student);
				}catch (Exception e1) {
					System.out.println(e1.getMessage());
					//e1.printStackTrace();
				}

			}
		});

		// create scene and set stage
		Scene scene = new Scene(bPane, 250, 200);

		primaryStage.setTitle("GradeBookApp");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	/**
	 * @return pane
	 * GUI part to hold the labels and the fields
	 */
	private Node TopPane() {
		// create Grid pane and to set properties
		GridPane pane = new GridPane();

		pane.setAlignment(Pos.TOP_CENTER);
		pane.setPadding(new Insets(12, 12, 12, 12));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		// Drop down using combo box
		listBox.getItems().addAll("A", "B", "C", "D", "E", "F");

		pane.add(firstName, 0, 0);
		pane.add(fName, 1, 0);
		pane.add(lastName, 0, 1);
		pane.add(lName, 1, 1);
		pane.add(course, 0, 2);
		pane.add(cName, 1, 2);
		pane.add(grade, 0, 3);
		pane.add(listBox, 1, 3);
		return pane;
	}

	/**
	 * @return pane
	 * Gui part to hold the buttons at the bottom horizontally
	 */
	private Node bottomPane() {
		// create HBox for the button

		HBox hBox = new HBox();
		hBox.setPadding(new Insets(12, 12, 12, 12));
		hBox.setSpacing(12);
		hBox.setAlignment(Pos.BASELINE_RIGHT);
		hBox.getChildren().addAll(btnClear, btnSave, btnView);
		return hBox;
	}

}