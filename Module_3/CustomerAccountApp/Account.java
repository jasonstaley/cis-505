/*
Student:	Jason Staley
Date: 		9/15/2021
Assignment: 3.1 - OO Methods
File Name: 	Account.java

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

public class Account {
    //Step 1 - private double data field named balance (default = 200)
    private double balance = 200;

    //Step 2 - accessor method for the balance data field
    public double getBalance() {
        return balance;
    }

    //Step 3 - public method named deposit with a double argument named amt and a return type of void
    //Keeps a accumulating total of the balance
    public void deposit(double amt){
        balance = balance + amt;
    }

    //Step 4 - public method named withdraw with a double argument named amt and a return type of void
    //Subtracts amount from balance if the amount is less than or equal to balance
    public void withdraw(double amt){
        if (balance >= amt)
            balance = balance - amt;
    }

    //Step 5 - public method named displayMenu with a return type of void
    //Displays a menu
    public void displayMenu(){
        System.out.println("\n  Account Menu");
        System.out.println("  Enter <D/d> for deposit");
        System.out.println("  Enter <W/w> for withdraw");
        System.out.println("  Enter <B/b> for balance");
        System.out.print("    Enter option>: ");
    }

    //Step 6 - public method named getTransactionDate with a return type of string
    //Format - MM-dd-yyyy
    //Source: Formatting Date and Time - https://www.w3schools.com/java/java_date.asp
    //Modified by J. Staley 2021
    public String getTransactionDate(){
        LocalDateTime custDate = LocalDateTime.now();
        DateTimeFormatter custDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String dispCustDate = custDate.format(custDateFormat);
        return dispCustDate;
    }
}