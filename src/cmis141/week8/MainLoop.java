package cmis141.week8;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainLoop {
    static String csvFile;

    public static void main(String[] args) {
        long tStart = System.nanoTime();
        csvFile = args[0];
        Scanner input = new Scanner(System.in);
        UserMenu menu = new UserMenu();

        while (true) {
            UserMenu.printUserMenu();
            String userInput = input.nextLine();
            if (Objects.equals(userInput, "q") || (Objects.equals(userInput, "Q"))) break;

            else if (Objects.equals(userInput, "1")) {
                menu.growth();
            } else if (Objects.equals(userInput, "2")) {
                menu.maxData();
            } else if (Objects.equals(userInput, "3")) {
                menu.minData();
            }
        }

        // print time spent in program
        long difference = System.nanoTime() - tStart;
        double elapsedSeconds = TimeUnit.NANOSECONDS.toSeconds(difference);
        System.out.println("Time spent in program: " + elapsedSeconds + " seconds.");
    }
}
