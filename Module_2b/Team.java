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

public class Team {
    //Step 1 - private string variable named teamName
    private String teamName;

    //Step 2 - private string array named players
    private String[] players = new String[20];

    //Step 3 - private int data field named playerCount (default - zero)
    private int playerCount = 0;

    //Step 4 - argument constructor
    public Team(String teamName) {
        this.teamName = teamName;
    }

    //Step 5 - public addPlayer method to add players - include playerCount increment
    public void addPlayer (String player) {
        players[playerCount] = player;
        playerCount++;
    }

    //Step 6 - public string array method that returns players
    public String[] getPlayers() {
        return players;
    }

    //Step 7 - public int method named getPlayerCount - returns number of players
    public int getPlayerCount() {
        return playerCount;
    }

    //Step 8 - public string method named getTeamName - returns team name
    public String getTeamName() {
        return teamName;
    }
}