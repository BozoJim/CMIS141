package cmis141.week3;

import java.util.Random;

/**
 * Created by jstok on 7/9/2017.
 */
class Quiz3 {
    public static void main(String[] args) {
        Random randomNo = new Random();

        for (int i = 0; i < 0; i++) {
            int randInt = randomNo.nextInt(100);
            if (randInt < 1 || randInt > 98) {
                System.out.println(randInt);
            }
        }


        int balance = 10;
        while (balance >= 1) {
            if (balance < 9) {
                break;
            }
            balance = balance - 9;
        }
        System.out.println(balance);


    }
}