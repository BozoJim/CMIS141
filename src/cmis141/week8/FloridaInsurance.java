package cmis141.week8;

/*
 * File: FloridaInsurance.java
 * Author: James Stokes
 * Date: 8-8-2017
 * Purpose: Construct a class that read a csv and print the data back out along with a count of the number of items.
 */

// import necessary packages
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FloridaInsurance {
    public static void main(String[] args) throws IOException {
        // declare string for filename.
        String csvFile;

        //if args are provided, use the first argument, otherwise use string below.
        if (args.length > 0) csvFile = args[0];
        else csvFile = "C:/Users/jstok/Google Drive/Documents/School Files/CMIS141/Week 8/Florida Insurance Sample.csv";

        // create BufferedReader. The name floridaInsurance is for the sample file I found however it be used with any csv.
        BufferedReader floridaInsurance = new FloridaInsurance().readFile(csvFile);

        // count the items in the csvFile.
        int maxLength = new FloridaInsurance().itemCount(csvFile);

        // begin while loop to print the csv file.
        String line;
        while ((line = floridaInsurance.readLine()) != null) {
            String[] aLine = line.split(",");

            // loop to print each item
            for (String item : aLine) {
                System.out.printf("%10.10s  ", item);  // column width truncated to 10 characters.
            }
            System.out.println();
        } // end while
        System.out.println(maxLength + " items read.");
    } // end main

    // attempt to read the file, print an appropriate error if file not found.
    private BufferedReader readFile(String file) throws FileNotFoundException {
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println(file + " was not found.");
            e.printStackTrace();
        }
        return bf;
    } // end readFile

    // loop through the file and count each comma separated item.
    private int itemCount(String file) throws IOException {
        BufferedReader br = new FloridaInsurance().readFile(file);
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            String[] thisLine = line.split(",");
            count += thisLine.length;
        }
        return count;
    } // end itemCount
} // end class