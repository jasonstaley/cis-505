/*
Student:	Jason Staley
Date: 		9/15/2021
Assignment: 3.1 - OO Methods
File Name: 	Customer.java

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

public class Customer {
    //Step 1 - private string variable named customerName
    private String customerName;

    //Step 2 - private string variable named customerAddress
    private String customerAddress;

    //Step 3 - private string variable named customerCity
    private String customerCity;

    //Step 4 - private string variable named customerZip
    private String customerZip;

    //Step 5 - no-argument constructor that creates a default customer
    public Customer(){
    }

    //Step 6 - argument constructor that creates a customer using the four data fields
    public Customer(String customerName, String customerAddress, String customerCity, String customerZip) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerCity = customerCity;
        this.customerZip = customerZip;
    }

    //Step 7 begin - Accessor methods for all four data fields
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public String getCustomerZip() {
        return customerZip;
    }
    //Step 7 - end

    //Step 8 - override the toString() method
    public String toString(){
        return "  --Customer Details--" + "\n  Name: " + customerName + "\n  Address: " + customerAddress + "\n  City: " + customerCity + "\n  Zip: " + customerZip;
    }
}