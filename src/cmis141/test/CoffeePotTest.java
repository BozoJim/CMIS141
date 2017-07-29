package cmis141.test;

import cmis141.week6.CoffeePot;
import org.junit.jupiter.api.Test;

/**
 * File: CoffeePotTest.java
 * Author: James Stokes
 * Date: 07-27-2017
 * Purpose: Construct two coffee pots with different inputs and test the output of each.
 */

class CoffeePotTest {

    // create two coffee pots
    private CoffeePot defaultCoffee = new CoffeePot();
    private CoffeePot coffeeOne = new CoffeePot("mild", 1, 0);

    @Test
    void setStrength() {
        // test the strength of each
        System.out.println("setStrength():");
        System.out.println(defaultCoffee.getStrength());
        defaultCoffee.setStrength("strong"); // should not work
        System.out.println(defaultCoffee.getStrength());
        defaultCoffee.setStrength("dark"); // should be accepted
        System.out.println(defaultCoffee.getStrength());
    }

    @Test
    void setPower() {
        System.out.println("setPower()");
        System.out.println(defaultCoffee.getPower());
        defaultCoffee.setPower(false);
        System.out.println(defaultCoffee.getPower());
        defaultCoffee.setPower(true);
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

        // test the no-argument constructor
        System.out.println("\ndefaultCoffee:");
        System.out.println(defaultCoffee.toString());
        defaultCoffee.makeCoffee(); // fails due to power being off
        defaultCoffee.setPower(true);
        System.out.println(defaultCoffee.toString());
        defaultCoffee.makeCoffee();

        // test the second constructor
        System.out.println("\ncoffeeOne:");
        coffeeOne.setPower(false);
        coffeeOne.setPower(true);
        System.out.println(coffeeOne.toString());
        coffeeOne.makeCoffee();
    }

}