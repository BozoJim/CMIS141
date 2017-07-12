package cmis141.week3;

import java.util.Scanner;

/**
 * File: MathDemo.java*
 * Author: Dr. Robertson
 * Date: January 1, 2015
 * Purpose: This program demonstrates the use of static methods* and fields of the Math class.
 **/

public class MathDemo {
    public static void main(String[] args) {
        double angle = 0.0;
        int negativeInt = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in degrees (0-360.0): ");
        angle = scanner.nextDouble();

        System.out.print("Enter a negativeint of your choice: ");
        negativeInt = scanner.nextInt();

        mathDemo(35, -35);
    }

    public static int mathDemo(double deg, int neg) {

        System.out.println("Welcome to the Math Class Demo.");

        System.out.println("The following angle was entered: " + deg);

        System.out.println("The following negatitive Int was entered: " + neg);

        System.out.println("abs():   " + Math.abs(deg));
        System.out.println("floor(): " + Math.floor(deg));
        System.out.println("sqrt():  " + Math.sqrt(deg));
        System.out.println("max():   " + Math.max(deg, 90.0));
        System.out.println("round(): " + Math.round(deg));

        deg = Math.toRadians(deg);
        System.out.println("Angle in radians: " + deg);

        System.out.println("sin(): " + Math.sin(deg));
        System.out.println("cos(): " + Math.cos(deg));
        System.out.println("tan(): " + Math.tan(deg));

        int randInt = (int) (Math.random() * 10);
        System.out.println("(int) (Math.random() * 10): " + randInt);
        randInt = (int) (Math.random() * 900 + 100);
        System.out.println("(int) (Math.random() * 900 + 100): " + randInt);
        randInt = (int) (Math.random() * 51 + 50);
        System.out.println("(int) (Math.random() * 51 + 50: " + randInt);

        return neg;

    } // end main
} // end MathDemo