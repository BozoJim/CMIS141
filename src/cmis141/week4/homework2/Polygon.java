package cmis141.week4.homework2;

/*  File:    Polygon.java
 *  Author:  Stokes, James
 *  Date:    7/11/2017
 *  Purpose: This class will accept a number of sides, side length, and x/y coordinates. There is a default constructor
 *           for no parameters as well as a constructor for all parameters.
 */

/**
 * Create a polygon
 */
public class Polygon {

    // variable initialization
    private int numSides;
    private double sideLength, xCoord, yCoord, perimeter;

    // no-argument constructor
    public Polygon() {
        this.numSides = 4;
        this.sideLength = 5.0;
        this.xCoord = 1.0;
        this.yCoord = 1.0;
        this.perimeter = getPerimeter(); // calculate and initialize perimeter based on method below
    }

    // constructor which accepts all necessary parameters
    public Polygon(int numSides, double sideLength, double xCoord, double yCoord) {
        this.numSides = numSides;
        this.sideLength = sideLength;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.perimeter = getPerimeter(); // calculate and initialize perimeter based on method below
    }

    // number of sides getter and setter
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    // side length getter and setter
    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    // x-coord getter and setter
    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    // y-coord getter and setter
    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    // initialize perimeter. called during constructor.
    public double getPerimeter() {
        perimeter = getNumSides() * getSideLength();
        return perimeter;
    }

    // toString method for basic output of polygon information
    @Override
    public String toString() {
        return "Polygon{" +
                "numSides=" + numSides +
                ", sideLength=" + sideLength +
                ", xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", perimeter=" + perimeter +
                '}';
    }

} // end Polygon