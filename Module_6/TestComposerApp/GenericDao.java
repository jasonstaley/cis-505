/*
Student:	Jason Staley
Date: 		10/6/2021
Assignment: Assignment 6.2 – Abstract Classes
File Name: 	GenericDao.java

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
import java.util.*;

public interface GenericDao<E, K> {

    List<E> findAll();
    E findBy(K key);
    void insert(E entity);
}