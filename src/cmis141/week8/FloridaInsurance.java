package cmis141.week8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FloridaInsurance {

    public static void main(String[] args) throws IOException {
        String csvFile = "C:/Users/jstok/Google Drive/Documents/School Files/CMIS141/Week 8/Florida Insurance Sample.csv";
        BufferedReader floridaInsurance = new FloridaInsurance().readFile(csvFile);
        String line;
        int maxLength = new FloridaInsurance().itemCount(csvFile);

        while ((line = floridaInsurance.readLine()) != null) {
            String[] aLine = line.split(",");

            for (String item : aLine) {
                System.out.printf("%10.10s  ", item);
            }
            System.out.println();
        }

        System.out.println(maxLength + " items read.");
    }

    private BufferedReader readFile(String file) throws FileNotFoundException {
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println(file + " was not found.");
            e.printStackTrace();
        }
        return bf;
    }

    private int itemCount(String file) throws IOException {
        BufferedReader br = new FloridaInsurance().readFile(file);
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            String[] thisLine = line.split(",");
            count += thisLine.length;
        }
        return count;
    }
}
