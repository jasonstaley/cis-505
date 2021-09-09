/*
Student:	Jason Staley
Date: 		9/5/2021
Assignment: 	1.3 - Create a class with four fan settings.
File Name: 	Fan.java

University:	Bellevue University
Class:		CIS505-T301 Intermediate Java Programming (2221-1)
Professor: 	Michael McGee

Citations:
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
Modified by J. Staley 2021
*/

public class Fan {
    
    //Step one - declare four constants to represent fans speed
    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    //Step two - declare a fan speed variable (default - 0)
    private int speed = STOPPED;

    //Step three - declare a fan on/off variable (default - off)
    private boolean on = false;

    //Step four - declare a fan radius variable (default - 6)
    private double radius = 6;

    //Step five - declare a fan color variable (default - white)
    private String color = "white";

    //Step six begin - accessor and mutator methods for all four variables

    //Speed accessor and mutator
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
	if (newSpeed == 0)
	    speed = STOPPED;
	if (newSpeed == 1)
	    speed = SLOW;
	if (newSpeed == 2)
	    speed = MEDIUM;
	if (newSpeed == 3)
	    speed = FAST;
    }

    //On/off switch accessor and mutator
    public boolean getOnOffStatus() {
        return on;
    }
    public void setOnOffStatus(boolean newOnOff) {
        on = newOnOff;
    }

    //Radius accessor and mutator
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
	if (newRadius > 0)
        radius = newRadius;
    }

    //Color accessor and mutator
    public String getColor() {
        return color;
    }
    public void setColor(String newColor) {
        color = newColor;
    }
    //Step six - end

    //Step seven - no-argument constructor
    public Fan() {
    }

    //Step eight - four argument constructor
    public Fan(int newSpeed, boolean newOnOff, double newRadius, String newColor) {
        speed = newSpeed;
	on = newOnOff;
        radius = newRadius;
        color = newColor;
    }

    //Step nine - override the toString method
    public String toString(){
	if(on == false)
            return "The fan is " + color + " with a radius of " + radius + " and the fan is off";
	else
            return "The fan speed is set to " + speed + " with a color of " + color + " and a radius of " + radius;
  }
}