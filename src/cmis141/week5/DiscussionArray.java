package cmis141.week5;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

/*  File:    DiscussionArray.java
 *  Author:  Stokes, James
 *  Date:    7/17/2017
 *  Purpose: A class that will accept any number of int or double, check the length of the array, and print the values back.
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DiscussionArray {
    // initialize array variables
    private int[] myIntArray;
    private double[] myDoubleArray;

    // constructor for int[]
    private DiscussionArray(int[] array) {
        this.myIntArray = array;
    }

    // constructor for double[]
    private DiscussionArray(double[] array) {
        this.myDoubleArray = array;
    }

    // getter and setter for int[]
    private int[] getMyIntArray() {
        return myIntArray;
    }

    public void setMyIntArray(int[] myIntArray) {
        this.myIntArray = myIntArray;
    }

    // getter and setter for double[]
    private double[] getMyDoubleArray() {
        return myDoubleArray;
    }

    public void setMyDoubleArrayArray(double[] myIntArray) {
        this.myDoubleArray = myIntArray;
    }

    // find and return lengh of array
    private int lengthOfIntArray() {
        return getMyIntArray().length;
    }

    private int lengthOfDoubleArray() {
        return getMyDoubleArray().length;
    }

    // for loop to print all values in an int[].
    private void printIntArray() {
        for (int i = 0; i < myIntArray.length; i++) {
            int[] array = myIntArray;
            System.out.format("myIntArray[%1d]: %3d\n", i, array[i]);
        }
    }

    // for loop to print all values in a double[].
    private void printDoubleArray() {
        // much needed formatting for decimals
        DecimalFormat df = new DecimalFormat(" 00.00;-00.00");

        for (int i = 0; i < myDoubleArray.length; i++) {
            double[] array = myDoubleArray;
            System.out.format("myDoubleArray[" + i + "]: " + df.format(array[i]) + "\n");
        }
    }

    //@Test // not working due to constructor error
    private void testIntArray() {
        DiscussionArray testArray = new DiscussionArray(myIntArray);
        //assertEquals(6, testArray.lengthOfIntArray()); // for testing. not working due to a requirement to create one constructor.
        System.out.println("Length of myIntArray: " + testArray.lengthOfIntArray());
        testArray.printIntArray();
    }

    //@Test // not working due to constructor error
    private void testDoubleArray() {
        DiscussionArray testArray = new DiscussionArray(myDoubleArray);
        //assertEquals(6, testArray.lengthOfDoubleArray()); // for testing. not working due to a requirement to create one constructor.
        System.out.println("Length of myDoubleArray: " + testArray.lengthOfDoubleArray());
        testArray.printDoubleArray();
    }

    // main method. simply printing the values due to constructor error when using a proper @Test.
    public static void main(String[] args) {
        // create two DiscussionArrays for testing
        DiscussionArray testOne = new DiscussionArray(new int[]{1, 5, 9, 26, -54, -78});
        DiscussionArray testTwo = new DiscussionArray(new double[]{1.0, 5.1, 9.2, 26.3, -54.4, -78.5, 84.6, -79.7});

        // print the results of the who arrays
        testOne.testIntArray();
        System.out.println(); // spacing for aesthetics.
        testTwo.testDoubleArray();
    } // end main

} // end Discussion Array