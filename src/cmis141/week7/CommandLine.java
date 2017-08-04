package cmis141.week7;

/* File: CommandLine.java
* Version / Changes Made:
* Author: t gray
* Instructor: Daniel Brownell
* Class: UMUC CMIS 141 4060
* Date: 3 Jul 2017
* Purpose: Generate X random numbers between 0 and Y using Command Line input
*/

public class CommandLine {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            //array[i] = (int) (Math.random() * (y+1));
            System.out.println("\tRandom int # " + (i + 1) + ": " + (int) (Math.random() * (y + 1)));
        }
    } // End of main
} // End of class