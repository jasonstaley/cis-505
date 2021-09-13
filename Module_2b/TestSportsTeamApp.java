/*
Student:	Jason Staley
Date: 		9/10/2021
Assignment: 2.3 - Object-Oriented Thinking
File Name: 	Team.java

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

public class TestSportsTeamApp {
    public static void main(String[] args) {
        //Step 9 - develop a program that will accept input for team information
        //and utilize the team class to create instances and display the contents of the object

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Declare variable to control while loop (user determines when to quit app)
        char continueLoop = 'y';

        //Title of App
        System.out.println("  Welcome to the Sports Team App");

        //Loop begin
        while (continueLoop == 'y') {

            //Prompt user for a team name
            System.out.print("\n  Enter a team name: ");

            //Collect team name
            String tName = input.nextLine();

            //Instance of Team class
            Team team = new Team(tName);

            //Prompt user for the player(s) name
            System.out.println("\n  Enter the player names: ");
            System.out.print("    hint: use commas for multiple players; no spaces>: ");

            //Collect player(s) name
            String pName = input.nextLine();
            //Convert string into an array
            String[] players = pName.split(",");

            //Add players to team object
            for (int i = 0; i < players.length; i++) {
                team.addPlayer(players[i]);
            }

            //Display summary of team details
            System.out.println();
            System.out.println("  --Team Summary--");
            System.out.println("  Number of players in team: " + team.getPlayerCount());
            System.out.print("  Players on team: ");

            //Extract and display players from array
            String[] players2 = team.getPlayers();
            for (int i = 0; i < team.getPlayerCount(); i++)
                System.out.print(players2[i] + ",");
            System.out.println();

            //Prompt user to continue
            System.out.println();
            System.out.print("  Continue? (y/n): ");

            //Collect user input
            continueLoop = input.nextLine().charAt(0);
        }

        //Confirm exit of loop
        System.out.println("\n  End of line...");
    }
}