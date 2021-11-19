package QA;


import javafx.application.Application;

import javafx.stage.Stage;

public class NatarajanGradeBookApp extends Application {

	public static void main(String[] args) throws Exception {
		launch(args);

	}

	// calls the object from the GradeBook class and start method of its own
	// this set is just for the clean look on the app/start page.
	@Override
	public void start(Stage primaryStage) throws Exception {
		new GradeBook().start(primaryStage);

	}

}