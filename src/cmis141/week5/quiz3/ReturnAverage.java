package cmis141.week5.quiz3;

/*  File:    DiscussionArray.java
 *  Author:  Stokes, James
 *  Date:    7/17/2017
 *  Purpose: A class that will accept any number of int or double, check the length of the array, and print the values back.
 */

import java.util.Arrays;

public class ReturnAverage {
    public static double average(double[] x) {
        double total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total / x.length;
    }

    public static void main(String[] args) {
        double[] myDouble = {2, 3, 4, 1, 5};
        System.out.println(average(myDouble));

        Arrays.sort(myDouble);
        for (int i = 0; i < myDouble.length; i++) {
            //System.out.println(myDouble[i]);
            if (myDouble[i] == 5) System.out.println(myDouble[i]);
        }


    }
}