/*
Student:	Jason Staley
Date: 		9/5/2021
Assignment: 	1.3 - Create a program with a main method to test the Fan class.
File Name: 	TestFanApp.java

University:	Bellevue University
Class:		CIS505-T301 Intermediate Java Programming (2221-1)
Professor: 	Michael McGee

Citations:
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
Modified by J. Staley 2021
*/

public class TestFanApp {  
    public static void main(String[] args) {

	//Step 10 Part 1 - Create two instances of the Fan class
       	Fan fan1 = new Fan();
	Fan fan2 = new Fan(2,true,8,"Blue");

	//Step 10 Part 2 - Display the objects by invoking the toString() method in the Fan class
	//System.out.println(fan1);
        //System.out.println(fan2);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
	
	/* Expected outcome:
	The fan is white with a radius of 6.0 and the fan is off
	The fan speed is set to 2 with a color of Blue and a radius of 8.0
	*/
    }
}