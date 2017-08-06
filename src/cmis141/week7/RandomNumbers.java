package cmis141.week7;

import java.util.Arrays;

/**
 * File: RandomNumbers.java
 * Author: James Stokes
 * Date: 8-1-2017
 * Purpose: Construct a class that will produce X random numbers from 0 to Y.
 */

public class RandomNumbers {
    public static void main(String[] args) {
        // collect variables from command line arguments as x and y.
        RandomNumbers checkArgs = new RandomNumbers();

        // check if args are valid ints and set them as x and y if passed
        int x, y;
        if (checkArgs.checkArg(args[0]) && checkArgs.checkArg(args[1])) {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        } else return;

        // create an array of random x ints from 0 to y.
        int[] myArray = new RandomNumbers().RandomInts(x, y);

        System.out.println("Random Array:");
        // print each random number in the array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(new RandomNumbers().printRandomNumber(i, myArray[i]));
        }
        System.out.println();

        // sort the same array of numbers
        int[] sortedArray = new RandomNumbers().sortedArray(myArray);
        System.out.println("Sorted Numbers:");
        // print the new sorted array
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(new RandomNumbers().printRandomNumber(i, sortedArray[i]));
        }

    } // end main

    // checks args to ensure they are ints
    private boolean checkArg(String x) {
        try {
            Integer.parseInt(x);
            return true;
        } catch (Exception e) {
            System.out.println(x + " is not valid. Arguments must be integers.");
            return false;
        }
    }

    // accepts two numbers, then creates an array for x numbers for 0 to y.
    private int[] RandomInts(int x, int y) {
        // initializes the array
        int[] randomArray = new int[x];

        // for num less than x, add number to array.
        for (int i = 0; i < x; i++) {
            randomArray[i] = (int) (Math.random() * (y + 1));
        }
        return randomArray;
    }

    // sort any int array received
    private int[] sortedArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    // print received numbers
    private String printRandomNumber(int iteration, int number) {
        return String.format("Random Int #%2d: %3d", iteration + 1, number);
    }
} // end class