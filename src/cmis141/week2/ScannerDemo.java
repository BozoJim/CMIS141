package cmis141.week2;

import java.util.Scanner;

/**
 * Created by jstok on 7/3/2017.
 */
public class ScannerDemo {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("enter a number: ");
        num = input.nextInt();

        System.out.println("You typed " + num);
    }

}