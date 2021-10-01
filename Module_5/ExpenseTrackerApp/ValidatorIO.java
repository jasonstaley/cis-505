/*
Student:	Jason Staley
Date: 		9/30/2021
Assignment: Assignment 5.1 – Input and Output Processes
File Name: 	ValidatorIO.java

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

public class ValidatorIO {

    //Step 1 - static method named getInt with a Scanner argument named sc and a string argument named prompt and an Integer return type
    public static int getInt(Scanner sc, String prompt){

        int input = 0;

        boolean isValid = false;

        while (!isValid)
        {
            System.out.print(prompt);

            if (sc.hasNextInt())
            {
                input = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("\n  Error! Invalid integer value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    //Step 2 - static method named getDouble with a Scanner argument named sc and a string argument named prompt and a double return type
    public static double getDouble(Scanner sc, String prompt){

        double input = 0;

        boolean isValid = false;

        while (!isValid)
        {
            System.out.print(prompt);

            if (sc.hasNextDouble())
            {
                input = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("\n  Error! Invalid double value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    //Step 3 - static method named getString with a Scanner argument named sc and a string argument named prompt and a string return type
    public static String getString(Scanner sc, String prompt){

        System.out.print(prompt);

        String input = sc.next();

        return input;
    }
}