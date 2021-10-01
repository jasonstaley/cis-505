/*
Student:	Jason Staley
Date: 		9/30/2021
Assignment: Assignment 5.1 – Input and Output Processes
File Name: 	Transaction.java

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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    //Step 1 - private string data field named date that specifies the date of a transaction
    //Source: https://www.w3schools.com/java/java_date.asp
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy");
    private String date = myDateObj.format(myFormatObj);

    //Step 2 - private string data field named description that specifies the description of a transaction
    private String description;

    //Step 3 - private double data field named amount that specifies the amount of a transaction
    private double amount = 0;

    //Step 4 begin - Accessor and mutator methods for all three data fields

    //Return date
    public String getDate() {
        return date;
    }

    //Set a new date
    public void setDate(String date) {
        this.date = date;
    }

    //Return description
    public String getDescription() {
        return description;
    }

    //Set a new description
    public void setDescription(String description) {
        this.description = description;
    }

    //Return amount
    public double getAmount() {
        return amount;
    }

    //Set a new amount
    public void setAmount(double amount) {
        this.amount = amount;
    }
    //Step 4 - end

    //Step 5 - no-argument constructor that creates a default transaction
    public Transaction(){
    }

    //Step 6 - argument constructor that creates a customer using the three data fields
    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    //Step 7 - override the toString() method
    public String toString(){
        return String.format("\n  Date: %s \n  Description: %s \n  Amount: $%6.2f", date, description, amount);
    }
}