package cmis141.test;

/*  File:    PolygonTest.java
 *  Author:  Stokes, James
 *  Date:    7/11/2017
 *  Purpose: This class test every method in Polygon.java to ensure the expected output.
 */

// class and junit imports

import cmis141.week4.homework2.Polygon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Polygon Test Cases
 */

class PolygonTest {

    // initialize acceptable error
    private double delta = 0.001;

    // construct new polygon for each test case as well as a default no-argument
    private Polygon defaultTest = new Polygon();
    private Polygon testCase1 = new Polygon();
    private Polygon testCase2 = new Polygon(3, 3.0, 3.0, 3.0);
    private Polygon testCase3 = new Polygon(5, 5.1, 5.1, 5.1);
    private Polygon testCase4 = new Polygon(7, 7.89, 7.89, 7.89);
    private Polygon testCase5 = new Polygon(27, 27.456, 27.456, -27.456);

    @Test
    void testCaseOne() throws Exception {
        // Test case 1 (Default): numSides=4, sideLength=5.0, xCoord=1.0, yCoord=1.0
        System.out.println("Test Case 1: numSides=4, sideLength=5.0, xCoord=1.0, yCoord=1.0");

        assertEquals("Polygon{numSides=4, sideLength=5.0, xCoord=1.0, yCoord=1.0, perimeter=20.0}", testCase1.toString());
        System.out.println("toString(): " + testCase1.toString());

        assertEquals(4, testCase1.getNumSides(), delta);
        System.out.println("getNumSides(): " + testCase1.getNumSides());

        assertEquals(5, testCase1.getSideLength(), delta);
        System.out.println("getSideLength(): " + testCase1.getSideLength());

        assertEquals(1.0, testCase1.getxCoord(), delta);
        System.out.println("getXCoord: " + testCase1.getxCoord());

        assertEquals(1.0, testCase1.getyCoord(), delta);
        System.out.println("getYCoord: " + testCase1.getyCoord());

        assertEquals(20.0, testCase1.getPerimeter(), delta);
        System.out.println("getPerimeter(): " + testCase1.getPerimeter());
    }

    @Test
    void testCaseTwo() throws Exception {
        // Test case 2: numSides=3, sideLength=3.0, xCoord=3.0, yCoord=3.0
        System.out.println("Test Case 2: numSides=3, sideLength=3.0, xCoord=5.0, yCoord=5.0");

        assertEquals("Polygon{numSides=3, sideLength=3.0, xCoord=3.0, yCoord=3.0, perimeter=9.0}", testCase2.toString());
        System.out.println("toString(): " + testCase2.toString());

        assertEquals(3, testCase2.getNumSides(), delta);
        System.out.println("getNumSides(): " + testCase2.getNumSides());

        assertEquals(3, testCase2.getSideLength(), delta);
        System.out.println("getSideLength(): " + testCase2.getSideLength());

        assertEquals(3.0, testCase2.getxCoord(), delta);
        System.out.println("getXCoord: " + testCase2.getxCoord());

        assertEquals(3.0, testCase2.getyCoord(), delta);
        System.out.println("getYCoord: " + testCase2.getyCoord());

        assertEquals(9.0, testCase2.getPerimeter(), delta);
        System.out.println("getPerimeter(): " + testCase2.getPerimeter());
    }

    @Test
    void testCaseThree() throws Exception {
        // Test case 3: numSides=5, sideLength=5.1, xCoord=5.1, yCoord=5.1
        System.out.println("Test Case 3: numSides=5, sideLength=5.0, xCoord=5.0, yCoord=5.0");

        assertEquals("Polygon{numSides=5, sideLength=5.1, xCoord=5.1, yCoord=5.1, perimeter=25.5}", testCase3.toString());
        System.out.println("toString(): " + testCase3.toString());

        assertEquals(5, testCase3.getNumSides(), delta);
        System.out.println("getNumSides(): " + testCase3.getNumSides());

        assertEquals(5.1, testCase3.getSideLength(), delta);
        System.out.println("getSideLength(): " + testCase3.getSideLength());

        assertEquals(5.1, testCase3.getxCoord(), delta);
        System.out.println("getXCoord: " + testCase3.getxCoord());

        assertEquals(5.1, testCase3.getyCoord(), delta);
        System.out.println("getYCoord: " + testCase3.getyCoord());

        assertEquals(25.5, testCase3.getPerimeter(), delta);
        System.out.println("getPerimeter(): " + testCase3.getPerimeter());
    }

    @Test
    void testCaseFour() throws Exception {
        // Test case 4: numSides=7, sideLength=7.89, xCoord=7.89, yCoord=7.89
        System.out.println("Test Case 4: numSides=7, sideLength=7.89, xCoord=7.89, yCoord=7.89");

        assertEquals("Polygon{numSides=7, sideLength=7.89, xCoord=7.89, yCoord=7.89, perimeter=55.23}", testCase4.toString());
        System.out.println("toString(): " + testCase4.toString());

        assertEquals(7, testCase4.getNumSides(), delta);
        System.out.println("getNumSides(): " + testCase4.getNumSides());

        assertEquals(7.89, testCase4.getSideLength(), delta);
        System.out.println("getSideLength(): " + testCase4.getSideLength());

        assertEquals(7.89, testCase4.getxCoord(), delta);
        System.out.println("getXCoord: " + testCase4.getxCoord());

        assertEquals(7.89, testCase4.getyCoord(), delta);
        System.out.println("getYCoord: " + testCase4.getyCoord());

        assertEquals(55.23, testCase4.getPerimeter(), delta);
        System.out.println("getPerimeter(): " + testCase4.getPerimeter());
    }

    @Test
    void testCaseFive() throws Exception {
        // Test case 4: numSides=27, sideLength=7.89, xCoord=7.89, yCoord=7.89
        System.out.println("Test Case 5: numSides=27, sideLength=27.456, xCoord=27.456, yCoord=-27.456");

        assertEquals("Polygon{numSides=27, sideLength=27.456, xCoord=27.456, yCoord=-27.456, perimeter=741.312}", testCase5.toString());
        System.out.println("toString(): " + testCase5.toString());

        assertEquals(27, testCase5.getNumSides(), delta);
        System.out.println("getNumSides(): " + testCase5.getNumSides());

        assertEquals(27.456, testCase5.getSideLength(), delta);
        System.out.println("getSideLength(): " + testCase5.getSideLength());

        assertEquals(27.456, testCase5.getxCoord(), delta);
        System.out.println("getXCoord: " + testCase5.getxCoord());

        assertEquals(-27.456, testCase5.getyCoord(), delta);
        System.out.println("getYCoord: " + testCase5.getyCoord());

        assertEquals(741.312, testCase5.getPerimeter(), delta);
        System.out.println("getPerimeter(): " + testCase5.getPerimeter());
    }

    // NumSides
    @Test
    void setNumSides() throws Exception {
        defaultTest.setNumSides(4);
        assertEquals(4, defaultTest.getNumSides());
    }

    @Test
    void getNumSides() throws Exception {
        assertEquals(4, defaultTest.getNumSides());
    }

    // SideLength
    @Test
    void setSideLength() throws Exception {
        defaultTest.setSideLength(5.0);
        assertEquals(5.0, defaultTest.getSideLength(), delta);
    }

    @Test
    void getSideLength() throws Exception {
        // Test case 1: Default
        assertEquals(5, defaultTest.getSideLength(), delta);
        // Test case 2: sideLength = 3
        defaultTest.setSideLength(3);
        assertEquals(3, defaultTest.getSideLength(), delta);

        // Test case 3: sideLength = 5.5
        defaultTest.setSideLength(5.5);
        assertEquals(5.5, defaultTest.getSideLength(), delta);

        // Test case 3: sideLength = 5.5
        defaultTest.setSideLength(22.73);
        assertEquals(22.73, defaultTest.getSideLength(), delta);
    }

    // x-coord
    @Test
    void setxCoord() throws Exception {
        defaultTest.setyCoord(1.0);
        assertEquals(1.0, defaultTest.getyCoord(), delta);
    }

    @Test
    void getxCoord() throws Exception {
        assertEquals(1.0, defaultTest.getxCoord(), delta);
    }

    // y-Coord
    @Test
    void setyCoord() throws Exception {
        defaultTest.setyCoord(1.0);
        assertEquals(1.0, defaultTest.getyCoord(), delta);
    }

    @Test
    void getyCoord() throws Exception {
        assertEquals(1.0, defaultTest.getyCoord(), delta);
    }

    // Perimeter
    @Test
    void setPerimeter() throws Exception {
        defaultTest.setNumSides(6);
        defaultTest.setSideLength(6.0);
        assertEquals(36.0, defaultTest.getPerimeter(), delta);
    }

    @Test
    void getPerimeter() throws Exception {
        assertEquals(20, defaultTest.getPerimeter(), 0.001);
    }

} // end PolygonTest