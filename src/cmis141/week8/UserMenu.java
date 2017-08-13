package cmis141.week8;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class UserMenu {
    private static USCrimeClass crimeData = new USCrimeClass("C:\\Users\\jstok\\Google Drive\\Documents\\School Files\\CMIS141\\Week 8\\Crime.csv");
    ArrayList<String[]> columns = new ArrayList<>(crimeData.getColumns());

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        while (true) {
            printUserMenu();
            String userInput = input.nextLine();
            if (Objects.equals(userInput, "q") || (Objects.equals(userInput, "Q"))) break;

            else if (Objects.equals(userInput, "1")) {
                growth();
            }
        }


        crimeData.printArray();
        System.out.println(Arrays.toString(crimeData.findMax("Violent crime rate")));
        //System.out.println(Arrays.toString(crimeData.getColumns().get(0)));
    }

    private static void printUserMenu() {
        System.out.println("Please choose an option. You may choose any column:");
        System.out.println("1. What were the percentages in growth for each consecutive year from 1994 – 2013?");
        System.out.println("2. Find the high for any column?"); // TODO create a method to find the high
        System.out.println("3. Find the low for any column?"); // TODO create a method to find the low
        System.out.println("Q. Quit the program");
    }

    private static void listColumns() {
        System.out.println("Choose between the following column choices:");

        String[] crimeColumns = crimeData.getColumns().get(0);
        for (int i = 0; i < crimeColumns.length; i++) {
            System.out.print(crimeColumns[i] + "\t");
            if (i % 4 == 3) System.out.println();
        }
    }

    private static void growth() {
        Scanner input = new Scanner(System.in);

        listColumns();
        String search = input.nextLine();
        crimeData.printDataArray(search);
    }
}
