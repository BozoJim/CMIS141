package cmis141.week8;

import java.io.FileNotFoundException;

public class UserMenu {
    public static void main(String[] args) throws FileNotFoundException {
        USCrimeClass crimeData = new USCrimeClass("C:\\Users\\jstok\\Google Drive\\Documents\\School Files\\CMIS141\\Week 8\\Crime.csv");

        crimeData.printArray();

    }
}
