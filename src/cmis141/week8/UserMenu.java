package cmis141.week8;

import java.util.Scanner;

class UserMenu {
    private static USCrimeClass crimeData = new USCrimeClass(MainLoop.csvFile);

    static void printUserMenu() {
        System.out.println("Please choose an option. You may choose any column:");
        System.out.println("1. What were the percentages in growth for each consecutive year from 1994 – 2013?");
        System.out.println("2. Find the high for any column?");
        System.out.println("3. Find the low for any column?"); // TODO create a method to find the low
        System.out.println("Q. Quit the program");
    }

    void growth() {
        Scanner input = new Scanner(System.in);

        crimeData.listColumns();
        String search = input.nextLine();
        crimeData.printDataArray(search);
    }

    void maxData() {
        Scanner input = new Scanner(System.in);

        crimeData.listColumns();
        String search = input.nextLine();
        Double[] crimeMax = crimeData.findMax(search);
        System.out.printf("The max for this column was in %4.4s: %.2f\n", String.valueOf(crimeMax[0]), crimeMax[1]);
    }

    void minData() {
        Scanner input = new Scanner(System.in);

        crimeData.listColumns();
        String search = input.nextLine();
        Double[] crimeMin = crimeData.findMin(search);
        System.out.printf("The min for this column was in %4.4s: %.2f\n", String.valueOf(crimeMin[0]), crimeMin[1]);
    }
}
