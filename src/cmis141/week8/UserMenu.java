package cmis141.week8;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class UserMenu {
    private static USCrimeClass crimeData = new USCrimeClass("C:\\Users\\jstok\\Downloads\\Crime.csv");
    ArrayList<String[]> columns = new ArrayList<>(crimeData.getColumns());

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("We'll be working with the following table:");
        crimeData.printArray();

        while (true) {
            printUserMenu();
            String userInput = input.nextLine();
            if (Objects.equals(userInput, "q") || (Objects.equals(userInput, "Q"))) break;

            else if (Objects.equals(userInput, "1")) {
                growth();
            } else if (Objects.equals(userInput, "2")) {
                maxData();
            } else if (Objects.equals(userInput, "3")) {
                minData();
            }

        }

        //System.out.println(Arrays.toString(crimeData.findMax("2")));
        //System.out.println(Arrays.toString(crimeData.getColumns().get(0)));
    }

    private static void printUserMenu() {
        System.out.println("Please choose an option. You may choose any column:");
        System.out.println("1. What were the percentages in growth for each consecutive year from 1994 – 2013?");
        System.out.println("2. Find the high for any column?");
        System.out.println("3. Find the low for any column?"); // TODO create a method to find the low
        System.out.println("Q. Quit the program");
    }

    private static void growth() {
        Scanner input = new Scanner(System.in);

        crimeData.listColumns();
        String search = input.nextLine();
        crimeData.printDataArray(search);
    }

    private static void maxData() {
        Scanner input = new Scanner(System.in);

        crimeData.listColumns();
        String search = input.nextLine();
        Double[] crimeMax = crimeData.findMax(search);
        System.out.printf("The max for this column was in %4.4s: %.2f\n", String.valueOf(crimeMax[0]), crimeMax[1]);
    }

    private static void minData() {
        Scanner input = new Scanner(System.in);

        crimeData.listColumns();
        String search = input.nextLine();
        Double[] crimeMin = crimeData.findMin(search);
        System.out.printf("The min for this column was in %4.4s: %.2f\n", String.valueOf(crimeMin[0]), crimeMin[1]);
    }
}
