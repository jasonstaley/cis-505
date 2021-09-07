/*
Student:	Jason Staley
Date: 		9/3/2021
Assignment: 	1.2 - Create a program that output's the String value "Hello World from YourFirstName YourLastName."
File Name: 	StaleyHelloWorld.java

University:	Bellevue University
Class:		CIS505-T301 Intermediate Java Programming (2221-1)
Professor: 	Michael McGee

Citations:
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

public class StaleyHelloWorld {
    public static void main(String[] args) {
		
        //Use String variables for the first and last name values.

	String fName = "Jason";
	String lName = "Staley";

	//Use printf to write the results to the System.out window.
	
	System.out.printf("Hello World from " + fName + " " + lName);
    }
}