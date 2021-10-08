/*
Student:	Jason Staley
Date: 		10/7/2021
Assignment: Assignment 6.2 – Abstract Classes
File Name: 	MemComposerDao.java

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
import java.util.ArrayList;

public class MemComposerDao implements ComposerDao{
    //public class MemComposerDao{
    //Step 1 - private List<Composer> data field named composers
    private ArrayList<Composer> composers = new ArrayList<>();

    //Step 2 - no-argument constructor that creates a default list of five composer objects
    public MemComposerDao(){
        //Create Composer objects
        Composer composer1 = new Composer(1007, "Ludwig Van Beethoven", "Classical");
        Composer composer2 = new Composer(1008, "Johann Sebastian Bach", "Classical");
        Composer composer3 = new Composer(1009, "Wolfgang Amadeus Mozart", "Classical");
        Composer composer4 = new Composer(1010, "Johannes Brahms", "Classical");
        Composer composer5 = new Composer(1011, "Joseph Haydn", "Classical");

        //Compile an ArrayList with the Composer objects
        composers.add(composer1);
        composers.add(composer2);
        composers.add(composer3);
        composers.add(composer4);
        composers.add(composer5);
    }

    //Step 3 - an overridden findAll method that returns a list of composer objects
    @Override
    public ArrayList findAll()
    {
        //Returns all composers in the list
        return composers;
    }

    //Step 4 - an overridden findBy method that returns a single composer object matching the arguments id
    @Override
    public Composer findBy(Integer id)
    {
        //Locate the composer object by id and return that specific Composer
        if (id == 1007)
            return composers.get(0);
        if (id == 1008)
            return composers.get(1);
        if (id == 1009)
            return composers.get(2);
        if (id == 1010)
            return composers.get(3);
        if (id == 1011)
            return composers.get(4);
        else
            return null;
    }

    //Step 5 - an overridden insert method that adds a new composer object to the list of composers
    @Override
    public void insert(Composer entity)
    {
        //Add a new composer to the Arraylist
        composers.add(entity);
    }
}
