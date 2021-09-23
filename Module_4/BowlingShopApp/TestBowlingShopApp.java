/*
Student:	Jason Staley
Date: 		9/23/2021
Assignment: 4.2 - Generics and Collections
File Name: 	TestBowlingShopApp.java

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

public class TestBowlingShopApp {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Option variable
        String option = "z";

        //Step 3 - Allow the user to keep selecting options until "x" is chosen
        while (!option.equalsIgnoreCase("x"))
        {
            //Step 2 - Display the menu to the user and invoke the getProducts method from the ProductDB class with the user’s entry as the argument

            //Display menu
            displayMenu();

            //Capture input
            option = input.nextLine();

            //Create a product generic queue named products
            GenericQueue<Product> products = new GenericQueue<Product>();

            //Invoke the getProducts method from the ProductDB class with the user’s entry as the argument and assign to products
            //Also, check if products is an instance of Generic Queue
            if (products instanceof GenericQueue) {
                products = ProductDB.getProducts(option);
            }

            //Display header
            if (!option.equalsIgnoreCase("x"))
            System.out.print("\n  --Product Listing--");

            //Use the queues size method in the while loops signature to keep track of your placement in the queue
            while (products.size() > 0){
                System.out.println(products.dequeue().toString());
            }
        }
        //Confirm exit of application
        System.out.println("\n\n  End of line...");
    }
    //Step 1 - public static method named displayMenu that displays the menu
    public static void displayMenu(){
        System.out.println("\n  MENU OPTIONS");
        System.out.println("    1. <b> Bowling Balls");
        System.out.println("    2. <a> Bowling Bags");
        System.out.println("    3. <s> Bowling Shoes");
        System.out.println("    4. <x> To exit");
        System.out.print("\n  Please choose an option: ");
    }
}