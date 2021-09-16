/*
Student:	Jason Staley
Date: 		9/16/2021
Assignment: 3.1 - OO Methods
File Name: 	TestCustomerAccountApp.java

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

import java.util.Scanner;

public class TestCustomerAccountApp {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Declare variable to control while loop (user determines when to quit app)
        char continueLoop = 'y';

        //Title of App
        System.out.println("  Welcome to the Customer Account App");

        //Step 1 - Prompt user for a customer number between 1007 and 1009
        //Takes the input and invokes the getCustomer static method and assigns it to a variable "customer"
        System.out.println("\n  Enter a customer ID: ");
        System.out.print("    ex: 1007, 1008, 1009>: ");
        int cNum = input.nextInt();
        CustomerDB.getCustomer(cNum);
        Customer customer = CustomerDB.getCustomer(cNum);

        //Create instance of Account
        Account custAcct = new Account();

        //Step 4 - Allow the user to continue to select as many options as they choose by prompting them to
        //decide between continuing or exiting the menu.
        do {
            //Step 2 - Display the account menu using the accounts displayMenu method
            custAcct.displayMenu();

            //Step 3 - Handle the user’s selection and invoke the corresponding method
            //Collect user selection
            char sel = input.next().charAt(0);

            //Conditionally invoke the corresponding method
            if (sel == 'D' || sel == 'd') {
                System.out.print("\n  Enter deposit amount: ");
                double dAmt = input.nextDouble();
                custAcct.deposit(dAmt);
            } else if (sel == 'W' || sel == 'w') {
                System.out.print("\n  Enter withdraw amount: ");
                double wAmt = input.nextDouble();
                custAcct.withdraw(wAmt);
            } else if (sel == 'B' || sel == 'b') {
                System.out.printf("\n  Account balance: $%6.2f", custAcct.getBalance());
                custAcct.getBalance();
            } else
                //Display for invalid options
                System.out.println("\n  Error: Invalid option");

            //Prompt user to continue
            System.out.println();
            System.out.print("  Continue? (y/n): ");

            //Collect user input
            continueLoop = input.next().charAt(0);
        }
        while (continueLoop == 'Y' || continueLoop == 'y');

        //Step 5 - After exiting the menu, display the customers details
        System.out.println();
        System.out.println(customer.toString());

        //Diplay balance and date
        System.out.print("\n  Balance as of " + custAcct.getTransactionDate() + " is ");
        System.out.printf("$%6.2f", custAcct.getBalance());

        //Confirm exit of application
        System.out.println("\n\n  End of line...");
    }
}