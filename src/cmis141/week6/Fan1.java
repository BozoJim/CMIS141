package cmis141.week6;

/*
 * File: FanDescription.java
 * Author: Raeford Smith Sr.
 * Date: July 28, 2017
 * Purpose: This program demonstrates the use of constructors, methods and instance variables.
 */

public class Fan1 {
    private static int SLOW = 1;
    private static int MEDIUM = 2;
    private static int FAST = 3;
    //instance variables
    private int speed = SLOW;
    private int mediumSpeed = MEDIUM;
    private int fastSpeed = FAST;
    private boolean isOn = true;
    private double radius = 5;
    private String color = "red";

    //constructors
    public Fan1() {
    }

    public Fan1(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    //methods

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMediumSpeed() {
        return mediumSpeed;
    }

    public void setMediumSpeed(int mediumSpeed) {
        this.mediumSpeed = mediumSpeed;
    }

    public int getFastSpeed() {
        return fastSpeed;
    }

    public void setFastSpeed(int fastSpeed) {
        this.fastSpeed = fastSpeed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setisOn(boolean isOn) {
        this.isOn = isOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "The speed of the fan is: " + speed + (speed == 11 ? ". It goes to eleven!" : "") + "\n" // easter egg
                + "Is the fan on?: " + isOn + "\n"
                + "The radius of the fan is:  " + radius + "\n"
                + "The color of the fan is: " + color + "\n";
    }

}