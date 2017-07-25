package cmis141.week5.quiz3;

/*  File:    DiscussionArray.java
 *  Author:  Stokes, James
 *  Date:    7/17/2017
 *  Purpose: A class that will accept any number of int or double, check the length of the array, and print the values back.
 */

public class TwoDArray {
    public static int[][] myArray = new int[5][10];

    public static int[][] randomArray() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                myArray[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return myArray;
    }

    public static void main(String[] args) {
        randomArray();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}