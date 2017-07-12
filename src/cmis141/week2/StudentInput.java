package cmis141.week2;

/*  File:    StudentInput.java
 *  Author:  Stokes, James
 *  Date:    6/26/2017
 *  Purpose: Receive input from the user display the information with some basic computation.
 */

// import required packages

import java.io.IOException;
import java.util.Scanner;

/**
 * Student Information Input
 */
public class StudentInput {
    public static void main(String[] args) throws IOException {
        Input();
    }

    public static int Input() {
        // variable initialization
        final int QUIZZES = 3;
        double[] quizScores = new double[QUIZZES];
        double total = 0; // to calculate the average later
        int age;
        double temperature;

        // Scanner creation
        Scanner input = new Scanner(System.in);

        // request ID number
        System.out.print("Enter your student EMPLID (00000-99999): ");
        int id = input.nextInt();


        // request score for each quiz
        for (int i = 0; i < QUIZZES; i++) {
            System.out.format("Enter the quiz%d score (ex. 0-100.0): ", i + 1);
            quizScores[i] = input.nextDouble();
            total += quizScores[i]; // add input to total variable for later average
        }

        // request age in months
        System.out.print("Enter your age in months (ex. 348): ");
        age = input.nextInt();

        // request current temperature
        System.out.format("Enter the current Temperature in degrees Celcius: ");
        temperature = input.nextDouble();

        // Thank You message
        System.out.println("\n***Thank You***");

        // print results
        System.out.println("Your student EMPLID is: " + id);
        for (int i = 0; i < QUIZZES; i++) {
            System.out.format("Quiz Score %d: %.1f\n", i + 1, quizScores[i]);
        }
        System.out.format("The average score is: %.1f\n", total / QUIZZES); // calculates average based on total / total number of quizzes
        System.out.println("Your age in months is: " + age);
        System.out.format("Your age in years is:  %d\n", age / 12);
        System.out.println("Current temperature in Celsius: " + temperature + "\u00b0");
        System.out.format("Current temperature in Fahrenheit: %.1f\u00b0", temperature * (9.0 / 5) + 32); // fahrenheit calculation is completed in the print statement.

        return 0;
    } // end method main

} // end class StudentInput