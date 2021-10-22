/*
Student:	Jason Staley
Date: 		10/21/2021
Assignment: Assignment 8.2 – FutureValueApp, Part 2
File Name: 	StaleyEnhancedFutureValueApp.java

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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StaleyEnhancedFutureValueApp extends Application{

    //Create private variables for two TextFields
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfInterestRate = new TextField();

    //Create one TextArea
    private TextArea taResults = new TextArea();
        
    //Create five Labels
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");
    private Label lblOutput = new Label();
        
    //Create one ComboBox of type Integer
    //Source: http://www.java2s.com/Tutorials/Java/javafx.scene.control/ComboBox/0300__ComboBox.itemsProperty_.htm
    ObservableList<Integer> list = FXCollections.observableArrayList(1,2,3,4,5,6,7,8,9,10);
    private ComboBox<Integer> cbYears = new ComboBox<Integer>(list);
    
    //Create two Buttons
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");
    
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
                
        //Monthly payment
        pane.add(lblMonthlyPayment, 1, 1);
        pane.add(tfMonthlyPayment, 2, 1);

        //Interest rate
        pane.add(lblInterestRate, 1, 2);
        pane.add(tfInterestRate, 2, 2);

        //Interest rate format
        //For the lblInterestRateFormat label, set the text fill to red and HPos to the right.
        lblInterestRateFormat.setTextFill(Color.RED);
        pane.add(lblInterestRateFormat, 2, 3);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        //Years
        pane.add(lblYears, 1, 4);
        GridPane.setHalignment(cbYears, HPos.LEFT);
        pane.add(cbYears, 2, 4);
        
        //Add the clear and calculate buttons to an HBox with a spacing of 10 and a padding of 15, 0, 15, and 30.
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().addAll(btnClear);
        actionBtnContainer.getChildren().addAll(btnCalculate);
        //pane.add(actionBtnContainer, 1, 4); - Assignment exhibit did not align correctly
        pane.add(actionBtnContainer, 2, 5);

        //Output date
        GridPane.setHalignment(lblOutput, HPos.LEFT);
        pane.add(lblOutput, 1, 6);

        //Text Area
        pane.add(taResults, 1, 7, 2, 1);
        
        //Process button events here
        btnClear.setOnAction(e -> clearFormFields());
        btnCalculate.setOnAction(e -> calculateResults());

        //Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 550);
  
        //Set the primary stages title to YourLastName Future Value App
        primaryStage.setTitle("Staley Enhanced Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //Method to calculate results when Calculate button is clicked
    private void calculateResults()
    {
        //Set variables to pass to FinanceCalculator
        double monthlyPayment = Double.parseDouble(tfMonthlyPayment.getText());
        double rate = Double.parseDouble(tfInterestRate.getText());
        int years = cbYears.getValue();
        
        //Display current date
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = myDateObj.format(myFormatObj);
        lblOutput.setText("Calculation as of " + date);
        
        //New instance of FinanceCalculator
        FinanceCalculator calc = new FinanceCalculator();
        
        //Display results of the calculation by calling the calculateFutureValue method
        taResults.setText(String.format("The future value is " + "$%,6.2f", calc.calculateFutureValue(monthlyPayment, rate, years)));
    }

    //Method to clear and reset form results when Clear button is clicked
    private void clearFormFields(){
        tfMonthlyPayment.clear();
        tfInterestRate.clear();
        taResults.clear();
        lblOutput.setText("");
        cbYears.setValue(0);
    }
  
  public static void main(String[] args) {
          launch(args);
      }
  }