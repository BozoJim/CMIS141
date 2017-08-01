//package cmis141.week7;

import java.util.Arrays;

/**
 * File: RandomNumbers.java
 * Author: James Stokes
 * Date: 07-31-2017
 * Purpose: Construct a class that will produce X random numbers from 0 to Y.
 */

public class RandomNumbers {
    private int[] RandomInts(int x, int y) {
        int[] randomArray = new int[x];

        for (int i=0; i<x; i++) {
            randomArray[i] = (int)(Math.random() * (y+1));
        }
        return randomArray;
    }

    private int[] sortedArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    private String printRandomNumber(int iteration, int number) {
        return String.format("Random Int #%2d: %3d", iteration+1, number);
    }

    public static void main(String[] args) {
        // collect variables from command line arguments as x and y.
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // create an array of random numbers
        int[] myArray =  new RandomNumbers().RandomInts(x,y);

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

    }
}
