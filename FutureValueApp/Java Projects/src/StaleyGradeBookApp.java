/*
Student:	Jason Staley
Date: 		11/5/2021
Assignment: Assignment 10.2 – Capstone Project: Sprint 1
File Name: 	StaleyGradeBookApp.java

University:	Bellevue University
Class:		CIS505-T301 Intermediate Java Programming (2221-1)
Professor: 	Michael McGee

Citations:
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by J. Staley 2021

Payne, D. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
Modified by J. Staley 2021
*/

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.geometry.HPos;
import javafx.geometry.Insets;

import java.lang.reflect.Array;

public class StaleyGradeBookApp extends Application{

    //Create private variables for three TextFields
    //first name, last name, course
    private TextField tfFirstName = new TextField();
    private TextField tfLastName = new TextField();
    private TextField tfCourse = new TextField();

    //Create one TextArea
    private TextArea taResults = new TextArea();

    //Create five Labels
    //first name, last name, course, grade, results
    private Label lblFirstName = new Label("First name:");
    private Label lblLastName = new Label("Last name:");
    private Label lblCourse = new Label("Course:");
    private Label lblGrade = new Label("Grade:");
    private Label lblOutput = new Label("Results:");
            
    //Create one ComboBox of type String
    //Source: http://www.java2s.com/Tutorials/Java/javafx.scene.control/ComboBox/0300__ComboBox.itemsProperty_.htm
    ObservableList<String> list = FXCollections.observableArrayList("A","B","C","D","F");
    private ComboBox<String> cbGrade = new ComboBox<String>(list);

    //Create three Buttons to: clear, view, or save grading data
    private Button btnClear = new Button("Clear");
    private Button btnView = new Button("View");
    private Button btnSave = new Button("Save");
    
    @Override
    public void start(Stage primaryStage){
      
        //In the start() method, add a new GridPane object
        GridPane pane = new GridPane();

        //Set its alignment to Pos.CENTER
        pane.setAlignment(Pos.CENTER);

        //set its padding to 11.5, 12.5, 13.5, and 14.5
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        
        //Next, set the panes Hgap to 5.5 and its Vgap to 5.5.
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        //Add the controls to the GridPane.
                
        //First name
        pane.add(lblFirstName, 1, 1);
        pane.add(tfFirstName, 2, 1);

        //Last name
        pane.add(lblLastName, 1, 2);
        pane.add(tfLastName, 2, 2);

        //Course
        pane.add(lblCourse, 1, 3);
        pane.add(tfCourse, 2, 3);

        //Grade
        pane.add(lblGrade, 1, 4);
        GridPane.setHalignment(cbGrade, HPos.LEFT);
        pane.add(cbGrade, 2, 4);

        //Add the clear, view, and save buttons to an HBox with a spacing of 10 and a padding of 15, 0, 15, and 30.
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().addAll(btnClear);
        actionBtnContainer.getChildren().addAll(btnView);
        actionBtnContainer.getChildren().addAll(btnSave);
        pane.add(actionBtnContainer, 2, 5);

        //Results
        pane.add(lblOutput, 1, 6);
        
        //Text Area
        pane.add(taResults, 1, 7, 2, 1);

        //Process button events here
        btnClear.setOnAction(e -> clearFormFields());
        btnView.setOnAction(e -> viewFormFields());
        btnSave.setOnAction(e -> saveFormFields());
        
        //Create a scene and place it in the stage
        Scene scene = new Scene(pane, 300, 500);
  
        //Set the primary stages title to YourLastName Future Value App
        primaryStage.setTitle("Staley Grade Book App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //Method to clear and reset form when Clear button is clicked
    private void clearFormFields(){
        tfFirstName.clear();
        tfLastName.clear();
        tfCourse.clear();
        cbGrade.setValue("");
        taResults.clear();
    }

    //Method to view saved grade entries
    private void viewFormFields(){
        //Content will be created in a future task
        System.out.println("In the view method.");
    }

    //Method to save grade entries
    private void saveFormFields(){
        //Content will be created in a future task
        System.out.println("In the save method.");
    }
  
  public static void main(String[] args) {
          launch(args);
      }
  }