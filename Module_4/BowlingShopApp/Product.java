/*
Student:	Jason Staley
Date: 		9/22/2021
Assignment: 4.2 - Generics and Collections
File Name: 	Product.java

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

public class Product {
    //Step 1 - private string data field named code that specifies the product code
    private String code;

    //Step 2 - private string data field named description that specifies the products description
    private String description;

    //Step 3 - private double data field named price that specifies the price of a product
    private double price = 0;

    //Step 4 - no-argument constructor that creates a default product
    public Product(){
    }

    //Step 5 begin - Accessor and mutator methods for all three data fields

    //Return code
    public String getCode() {
        return code;
    }

    //Set a new code
    public void setCode(String code) {
        this.code = code;
    }

    //Return description
    public String getDescription() {
        return description;
    }

    //Set a new description
    public void setDescription(String description) {
        this.description = description;
    }

    //Return price
    public double getPrice() {
        return price;
    }

    //Set a new price
    public void setPrice(double price) {
        this.price = price;
    }
    //Step 5 - end

    //Step 6 - override the toString() method - return a description of the product with all three fields on separate lines
    public String toString(){
        return String.format("\n  Product code: %s \n  Description: %s \n  Price $%6.2f", code, description, price);
    }
}