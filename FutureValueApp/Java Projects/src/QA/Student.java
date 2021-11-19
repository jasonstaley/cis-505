package QA;



/**
 * @author Deepa
 * Student class with fields, getters , setters and overridden toString method
 *
 */
public class Student {

	private String firstName, lastName, course, grade;

	 /**
	 * constructor with null values
	 */
	Student() {
		firstName = null;
		lastName = null;
		course = null;
		grade = null;
	}

	 /**
	 * @param firstName
	 * @param lastName
	 * @param course
	 * @param grade
	 * constructor with input values
	 */
	Student(String firstName, String lastName, String course, String grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.grade = grade;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCourse() {
		return course;
	}

	public String getGrade() {
		return grade;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		String cString=",";

		String str = firstName+cString+lastName+cString+course+cString+grade;
		
		return str;

	}

}