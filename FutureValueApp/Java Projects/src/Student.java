/*
Student:	Jason Staley
Date: 		11/11/2021
Assignment: Assignment 11.2 – Capstone Project: Sprint 2 - Item 11
File Name: 	Student.java

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

public class Student {
  
    //private variables
    private String firstName;
    private String lastName;
    private String course;
    private String grade;

    //no-argument constructor that creates a default student
    public Student(){
    }

    //argument constructor that creates a student using all four data fields
    public Student(String firstName, String lastName, String course, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.grade = grade;
    }

    //getter/setter methods for the class properties

    //return first name
    public String getFirstName() {
        return firstName;
    }

    //set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //return last name
    public String getLastName() {
        return lastName;
    }

    //set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //return course
    public String getCourse() {
        return course;
    }

    //set course
    public void setCourse(String course) {
        this.course = course;
    }

    //return grade
    public String getGrade() {
        return grade;
    }

    //set grade
    public void setGrade(String grade) {
        this.grade = grade;
    }

    //override the toString() method
    public String toString(){
        return "First name: " + firstName + "\nLast name: " + lastName + "\nCourse: " + course + "\nGrade: " + grade;
    }

}
