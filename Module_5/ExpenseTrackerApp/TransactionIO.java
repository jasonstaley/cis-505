/*
Student:	Jason Staley
Date: 		9/30/2021
Assignment: Assignment 5.1 – Input and Output Processes
File Name: 	TransactionIO.java

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

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TransactionIO {
    //Step 1 - private string constant data field named FILE_NAME. The default value is expenses.txt
    private final static String FILE_NAME = "expenses.txt";

    //Step 2 - private File data field name file. The default value is a new File instance. Use the FILE_NAME constant as the argument for the new file instance
    private static File file = new File(FILE_NAME);

    //Step 3 - public static method named bulkInsert with an ArrayList<Transaction> argument named transactions and a return type of void
    public static void bulkInsert (ArrayList<Transaction> transactions) throws IOException {

        PrintWriter output = null;

        //Append to existing file
        if (file.exists())
        {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        }

        //Create a new file
        else
        {
            output = new PrintWriter(FILE_NAME);
        }

        //Iterate over the transactions and print to file
        for (Transaction tran : transactions)
        {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }

        //Close file to ensure data is saved properly in the file
        output.close();

    }

    //Step 4 - public static method named findAll with a return type of ArrayList<Transaction>
    public static ArrayList<Transaction> findAll () throws IOException {

        //Invokes scanner to open expenses.txt file
        Scanner input = new Scanner(file);

        //Create a new ArrayList to store Transaction objects
        ArrayList<Transaction> list = new ArrayList<Transaction>();

        //Iterate through the file
        while (input.hasNext())
        {
            //Declare a Transaction object for each iteration
            Transaction tran = new Transaction();

            //Set each element with the setter method from the Transaction class
            tran.setDate(input.next());
            tran.setDescription(input.next());
            tran.setAmount(input.nextDouble());

            //Add each tran object to the array list
            list.add(tran);
        }

        //Return the ArrayList that was generated from the text file
        return list;
    }
}