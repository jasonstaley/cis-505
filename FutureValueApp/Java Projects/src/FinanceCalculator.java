/*
Student:	Jason Staley
Date: 		10/21/2021
Assignment: Assignment 8.2 – FutureValueApp, Part 2
File Name: 	FinanceCalculator.java

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

public class FinanceCalculator {
  
    //Declare constant
    private static final int MONTHS_IN_YEAR = 12;
  
    public double calculateFutureValue(double monthlyPayment, double rate, int years){

        //Calculate months
        int months = MONTHS_IN_YEAR * years;

        //Calculate rate
        rate = (1 + rate/100);

        //Calculate present value
        double presentValue = monthlyPayment * months;
             
        //Calculate future value
        double futureValue = presentValue * (Math.pow(rate, months));

        //Return future value
        return futureValue;
    }

  }