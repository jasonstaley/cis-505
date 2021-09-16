/*
Student:	Jason Staley
Date: 		9/15/2021
Assignment: 3.1 - OO Methods
File Name: 	CustomerDB.java

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

public class CustomerDB {
    //Step 1 - public static method named getCustomer with an Integer argument named id and a return type of Customer
    public static Customer getCustomer(int id){
        if (id == 1007){
            Customer cust = new Customer("Andrew Anderson","1234 First Street", "Lincoln", "68505");
            return cust;
        }
        else if (id == 1008) {
            Customer cust = new Customer("Bobby Baker", "2345 Second Street", "Omaha", "68111");
            return cust;
        }
        else if (id == 1009) {
            Customer cust = new Customer("Caroline Connor", "3456 Third Street", "Eagle", "68347");
            return cust;
        }
        else {
            Customer cust = new Customer();
            return cust;
        }
    }
}