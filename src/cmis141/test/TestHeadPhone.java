package cmis141.test;

/*
  File: TestHeadPhone.java
  Author: James Stokes
  Date: 07-28-2017
  Purpose: Create four headphones to test. Tests three different headphones then uses a second no-argument headphone
  to test the setters and getters.
 */

// import package, Test, and Color.

import cmis141.week6.HeadPhone;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static cmis141.week6.HeadPhone.HIGH;
import static cmis141.week6.HeadPhone.LOW;
import static org.junit.jupiter.api.Assertions.assertEquals;

// import statics due to the constants being in a different package.

class TestHeadPhone {

    // initialize four headphones for testing
    private HeadPhone headPhoneOne = new HeadPhone();
    private HeadPhone headPhoneTwo = new HeadPhone(LOW, false, "Bose", Color.green, "QC35");
    private HeadPhone headPhoneThree = new HeadPhone(HIGH, true, "Sony", Color.blue, "MDR-7502");
    private HeadPhone headPhoneFour = new HeadPhone();

    // test the first (no-argument) headphone
    @Test
    void testOne() {
        System.out.println("headPhoneOne:");
        assertEquals(2, headPhoneOne.getVolume());
        assertEquals(false, headPhoneOne.isPluggedIn());
        assertEquals("Toshiba", headPhoneOne.getManufacturer());
        assertEquals(Color.gray, headPhoneOne.getHeadPhoneColor());
        assertEquals("T-850", headPhoneOne.getHeadPhoneModel());

        System.out.println(headPhoneOne.toString());
    }

    // test the second (no-argument) headphone
    @Test
    void testTwo() {
        System.out.println("headPhoneTwo:");
        assertEquals(1, headPhoneTwo.getVolume());
        assertEquals(false, headPhoneTwo.isPluggedIn());
        assertEquals("Bose", headPhoneTwo.getManufacturer());
        assertEquals(Color.green, headPhoneTwo.getHeadPhoneColor());
        assertEquals("QC35", headPhoneTwo.getHeadPhoneModel());

        System.out.println(headPhoneTwo.toString());
    }

    // test the third headphone
    @Test
    void testThree() {
        System.out.println("headPhoneThree:");
        assertEquals(3, headPhoneThree.getVolume());
        assertEquals(true, headPhoneThree.isPluggedIn());
        assertEquals("Sony", headPhoneThree.getManufacturer());
        assertEquals(Color.blue, headPhoneThree.getHeadPhoneColor());
        assertEquals("MDR-7502", headPhoneThree.getHeadPhoneModel());

        System.out.println(headPhoneThree.toString());
    }

    // test the fourth (no-argument) headphone. Also testing the setters and getters.
    @Test
    void testFour() {
        System.out.println("headPhoneFour: initial, after set");

        // volume
        System.out.println("volume: " + headPhoneFour.getVolume());
        headPhoneFour.setVolume(1);
        assertEquals(1, headPhoneFour.getVolume());
        System.out.println("volume: " + headPhoneFour.getVolume());
        headPhoneFour.changeVolume(HIGH); // does the same job as setVolume
        assertEquals(3, headPhoneFour.getVolume());
        System.out.println("volume: " + headPhoneFour.getVolume() + "\n");

        // pluggedIn
        System.out.println("pluggedIn: " + headPhoneFour.isPluggedIn());
        headPhoneFour.setPluggedIn(true);
        assertEquals(true, headPhoneFour.isPluggedIn());
        System.out.println("pluggedIn: " + headPhoneFour.isPluggedIn() + "\n");

        // manufacturer
        System.out.println("manufacturer: " + headPhoneFour.getManufacturer());
        headPhoneFour.setManufacturer("Samsung");
        assertEquals("Samsung", headPhoneFour.getManufacturer());
        System.out.println("manufacturer: " + headPhoneFour.getManufacturer() + "\n");

        // headPhoneColor
        System.out.println("headPhoneColor: " + headPhoneFour.getHeadPhoneColor());
        headPhoneFour.setHeadPhoneColor(Color.cyan);
        assertEquals(Color.cyan, headPhoneFour.getHeadPhoneColor());
        System.out.println("HeadPhoneColor: " + headPhoneFour.getHeadPhoneColor() + "\n");

        // headPhoneModel
        System.out.println("headPhoneModel: " + headPhoneFour.getHeadPhoneModel());
        headPhoneFour.setHeadPhoneModel("EO-PN920CFEGUS");
        assertEquals("EO-PN920CFEGUS", headPhoneFour.getHeadPhoneModel());
        System.out.println("HeadPhoneColor: " + headPhoneFour.getHeadPhoneModel() + "\n");

        // toString
        System.out.println(headPhoneFour.toString());
    }

} // end class