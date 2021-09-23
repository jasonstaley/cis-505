/*
Student:	Jason Staley
Date: 		9/22/2021
Assignment: 4.2 - Generics and Collections
File Name: 	Shoe.java

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

public class Shoe extends Product {
    //Step 1 - private string data field named color that specifies the shoe size
    private double size = 0;

    //Step 2 - no-argument constructor that creates a default shoe
    public Shoe(){
    }

    //Step 3 begin - Accessor and mutator methods for the size data field

    //Return size
    public double getSize() {
        return size;
    }

    //Set a new size
    public void setSize(double size) {
        this.size = size;
    }
    //Step 3 - end

    //Step 4 - override the toString() method - return an appended string of the superclass with an additional field for the shoe size
    @Override
    public String toString(){
        return super.toString() + "\n  Size: " + size;
    }
}