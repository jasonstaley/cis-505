/*
Student:	Jason Staley
Date: 		10/1/2021
Assignment: Assignment 5.1 – Input and Output Processes
File Name: 	TestExpenseTracker.java

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
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class TestExpenseTracker {
    public static void main(String[] args) {

        //Variable for current date
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String date = myDateObj.format(myFormatObj);

        //Create a Scanner object
        Scanner sc = new Scanner(System.in);

        //Declare variable to control while loop
        char continueLoop = 'y';

        //Allow the user to continue until they decide to exit the menu
        do {

            //Validate and collect user input
            int input = ValidatorIO.getInt(sc, menu());

            //View Transactions
            if (input == 1) {
                try {
                    ArrayList<Transaction> transactions = new ArrayList<Transaction>(TransactionIO.findAll());
                    System.out.print("\n  MONTHLY EXPENSES\n");

                    //Iterate over the array list and print out each item
                    for (Transaction transaction : transactions)
                    {
                        System.out.println(transaction.toString());
                    }
                }
                catch (IOException e) {
                    System.out.println("\n  Exception (option 1): " + e.getMessage());
                }
            }

            //Add Transactions
            else if (input == 2) {
                String c = "y";
                ArrayList<Transaction> transactions = new ArrayList<>();

                //User controls how many transactions are entered
                while (c.equalsIgnoreCase("y")) {

                    //Validate and collect user input
                    String description = ValidatorIO.getString(sc, "\n  Enter the description: ");

                    //Validate and collect user input
                    double amount = ValidatorIO.getDouble(sc, "  Enter the amount: ");

                    Transaction transaction = new Transaction(date, description, amount);

                    transactions.add(transaction);

                    c = ValidatorIO.getString(sc, "\n  Add another transaction? (y/n): ");
                }
                try {
                    TransactionIO.bulkInsert(transactions);
                }
                catch (IOException e) {
                    System.out.println("\n  Exception (option 2): " + e.getMessage());
                }
            }

            //View Expense
            else if (input == 3) {
                try {
                    //Declare variable to hold running total of all transactions
                    double monthlyExpense = 0;

                    //Invoke the findAll method from the TransactionIO class
                    ArrayList<Transaction> transactions = new ArrayList<Transaction>(TransactionIO.findAll());

                    //Iterate over the list to get a running total of the transaction amounts
                    for (Transaction transaction : transactions)
                    {
                        monthlyExpense += transaction.getAmount();
                    }
                    System.out.printf("\n  Your total monthly expense is $%6.2f", monthlyExpense);
                }
                catch (IOException e){
                    System.out.println("\n  Exception (option 3): " + e.getMessage());
                }
            }
            //Prompt user to continue
            System.out.print("\n  Continue? (y/n): ");

            //Collect user input
            continueLoop = sc.next().charAt(0);
        }
        while (continueLoop == 'Y' || continueLoop == 'y');

        //Confirm exit of application
        System.out.println("\n\n  Program terminated by the user...");
    }
    //Step 1 - Display a menu to the user - method
    public static String menu(){
        return "\n  Welcome to the Expense Tracker  \n\n  MENU OPTIONS  \n    1. View Transactions  \n    2. Add Transactions  \n    3. View Expense \n\n  Please choose an option: ";
    }
}