/*
Student:	Jason Staley
Date: 		10/6/2021
Assignment: Assignment 6.2 – Abstract Classes
File Name: 	Composer.java

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

public class Composer {
    //Step 1 - private integer data field named id
    private int id;

    //Step 2 - private string data field named name
    private String name;

    //Step 3 - private string data field named genre
    private String genre;

    //Step 4 - no-argument constructor that creates a default composer
    public Composer(){
    }

    //Step 5 - argument constructor that creates a composer using all three data fields
    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    //Step 6 begin - Accessor methods for all three data fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }
    //Step 6 - end

    //Step 7 - override the toString() method
    public String toString(){
        return "  Id: " + id + "\n  Name: " + name + "\n  Genre: " + genre + "\n";
    }
}