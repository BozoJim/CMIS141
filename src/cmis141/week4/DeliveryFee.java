package cmis141.week4;/*

 * File: EmployeeData.java

 * Author: Raeford Smith Sr.

 * Date: July 10, 2017

 * Purpose: This program demonstrates the use of two methods and a constructor in a class, with private fields.

 */

public class DeliveryFee {

    private double fuel;

    private double distance;

    public DeliveryFee(double startFuel, double startDistance) {
        fuel = startFuel;
        distance = startDistance;
    }

    public DeliveryFee() {
        fuel = 0.0;
        distance = 0.0;
    }

    // Setter methods

    // getFuel
    public double getFuel() {
        return fuel;
    }

    // setFuel
    public void setFuel(double startFuel) {
        fuel = startFuel;
    }

    // Getter methods

    // getDistance
    public double getDistance() {
        return distance;
    }

    // setDistance()
    public void setDistance(double startDistance) {
        distance = startDistance;
    }

    //calculate the cost of fuel * distance
    public double cost() {
        return fuel * distance;
    }

    // toString method
    @Override
    public String toString() {
        return "DeliveryFee{" + "fuel=" + fuel + ", distance=" + distance + '}' +
                "\nThe delivery fee is : " + cost();
    }
} // end