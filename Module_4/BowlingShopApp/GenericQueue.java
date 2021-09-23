/*
Student:	Jason Staley
Date: 		9/22/2021
Assignment: 4.2 - Generics and Collections
File Name: 	GenericQueue.java

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
import java.util.LinkedList;

public class GenericQueue<E> {

    //Step 1 - private generic link list data field named list
    private LinkedList<E> list = new LinkedList<E>();

    //Step 2 - public method named enqueue with a generic argument named item that adds the item to the list using the addFirst method
    public void enqueue(E item){
        list.addFirst(item);
    }

    //Step 3 - public method named dequeue with a generic return type that removes the first object in the queue using the removeFirst method
    public E dequeue(){
        return list.removeFirst();
    }

    //Step 4 - public method named size with a data return type of integer that specifies the size of the list using the size method
    public int size(){
        return list.size();
    }
}