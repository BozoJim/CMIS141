/*
 * File: ReadFromFile.java
 * Author: Hieu Dao-Mai
 * Date: 8-10-2017
 * Purpose: Construct a class that read a csv and print the data back out along with a count of the number of items.
 */

package cmis141.week8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader readfile;
        if (args.length > 0) {
            readfile = new FileReader(args[0]);
        } else {
            readfile = new FileReader("C:\\Users\\jstok\\Google Drive\\Documents\\School Files\\CMIS141\\Week 8\\ReadMe.txt");
        }
        int i;
        int charCount = 0;
        try {
            while ((i = readfile.read()) != -1)                //loop to read file
            {
                System.out.print((char) i);                //print loop character
                charCount = countChar(charCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
        System.out.println("*************************");
        System.out.println("Total character count: " + charCount); // print
    }

    //Generate countChar method
    private static int countChar(int charCount) {
        return ++charCount;
    }
}