//package cmis141.week7;

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
            randomArray[i] = (int)(Math.random() * y);
        }
        return randomArray;
    }

    private String printRandomNumber(int iteration, int number) {
        return String.format("Random Int #%2d: %3d", iteration+1, number);
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        RandomNumbers arrayOfInts =  new RandomNumbers();
        int[] myArray = arrayOfInts.RandomInts(x, y);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(arrayOfInts.printRandomNumber(i, myArray[i]));
        }
    }
}
