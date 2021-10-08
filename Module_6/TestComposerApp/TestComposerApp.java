/*
Student:	Jason Staley
Date: 		10/7/2021
Assignment: Assignment 6.2 – Abstract Classes
File Name: 	TestComposerApp.java

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
import java.util.ArrayList;

public class TestComposerApp {
    public static void main(String[] args) {

        //Create instance of MemComposerDao class
        MemComposerDao mcd = new MemComposerDao();

        //Create a Scanner object
        Scanner sc = new Scanner(System.in);

        //Declare variable to control while loop
        int input;

        //Greeting
        System.out.print("\n  Welcome to the Composer App\n");

        //Allow the user to continue until they decide to exit the menu
        do {
            //Step 1 - Display menu
            System.out.print(menu());

            //Capture input
            input = sc.nextInt();

            //Step 1 - View Composers
            if (input == 1) {

                //Step 2 - Use the MemComposerDao classes findAll method
                ArrayList<Composer> composerList = new ArrayList<Composer>(mcd.findAll());
                System.out.print("\n  --DISPLAYING COMPOSERS--\n");

                //Iterate over the array list and print out each item
                for (Composer composers : composerList)
                {
                    System.out.println(composers.toString());
                }
            }

            //Step 2 - Find Composer
            else if (input == 2) {

                //Prompt the user to enter an id and display the selected composer object

                //Declare variable to send to findBy method
                int composerId;

                //Prompt user for input
                System.out.print("\n  Enter an id: ");

                //Capture input
                composerId = sc.nextInt();

                //Step 3 - Use the MemComposerDao classes findBy method

                //Create Composer object
                Composer findComposor = new Composer();

                //Use findBy method to locate composer
                findComposor = mcd.findBy(composerId);

                //Display results of lookup
                System.out.println("\n  --DISPLAYING COMPOSER--");
                System.out.println("  Id: " + findComposor.getId());
                System.out.println("  Name: " + findComposor.getName());
                System.out.println("  Genre: " + findComposor.getGenre());
            }

            //Step 3 - Add Composer
            else if (input == 3) {

                //Prompt the user to create a new composer

                //Declare variables to add a new composer
                int newComposerId;
                String newComposerName;
                String newComposerGenre;

                //Prompt user for new composer id
                System.out.print("\n  Enter an id: ");

                //Capture input
                newComposerId = sc.nextInt();

                //Workaround for using nextLine after token-based input
                //Source: Rohit Jain https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
                sc.nextLine();

                //Prompt user for new composer name
                System.out.print("  Enter a name: ");

                //Capture input
                newComposerName = sc.nextLine();

                //Prompt user for new composer genre
                System.out.print("  Enter a genre: ");

                //Capture input
                newComposerGenre = sc.nextLine();

                //Create object with collected data
                Composer newComposer = new Composer(newComposerId, newComposerName, newComposerGenre);

                //Step 4 - Use the MemComposerDao classes insert method
                mcd.insert(newComposer);
            }
        } while (input != 4);  //Option 4 is exit

        //Confirm exit of application
        System.out.println("\n\n  Program terminated by the user...");
    }
    //Step 1 - Display a menu to the user - method
    public static String menu(){
        return "\n  MENU OPTIONS  \n    1. View Composers  \n    2. Find Composer  \n    3. Add Composer  \n    4. Exit \n\n  Please choose an option: ";
    }
}