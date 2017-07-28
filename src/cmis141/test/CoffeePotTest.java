package cmis141.test;

import cmis141.week6.CoffeePot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jstok on 7/28/2017.
 */
class CoffeePotTest {

    Scanner input = new Scanner(System.in);

    CoffeePot defaultCoffee = new CoffeePot();
    CoffeePot coffeeOne = new CoffeePot("mild",2,2);

    @Test
    void setStrength() {
        System.out.println("setStrength():");
        System.out.println(defaultCoffee.getStrength());
        System.out.println(coffeeOne.getStrength());
    }

    @Test
    void setPower() {
        System.out.println("setPower()");
        System.out.println(defaultCoffee.getPower());
        defaultCoffee.setPower("fred");
        System.out.println(defaultCoffee.getPower());
    }

    @Test
    void setCreme() {
    }

    @Test
    void setSugar() {
    }

    @Test
    void makeCoffee() {
        System.out.println("makeCoffee():");
        defaultCoffee.makeCoffee(defaultCoffee.getPower());
        defaultCoffee.setPower("fred");
        defaultCoffee.makeCoffee(defaultCoffee.getPower());
        defaultCoffee.setPower("on");
        defaultCoffee.makeCoffee(defaultCoffee.getPower());
    }

}