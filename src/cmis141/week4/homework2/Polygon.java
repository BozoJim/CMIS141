package cmis141.week4.homework2;

/**
 * Created by 590905 on 7/10/2017.
 */
public class Polygon {

    private int numSides;
    private double sideLength, xCoord, yCoord, perimeter;

    public Polygon() {
        this.numSides = 4;
        this.sideLength = 5.0;
        this.xCoord = 1.0;
        this.yCoord = 1.0;
        this.perimeter = getPerimeter();
    }

    public Polygon(int numSides, double sideLength, double xCoord, double yCoord) {
        this.numSides = numSides;
        this.sideLength = sideLength;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.perimeter = getPerimeter();
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public double getPerimeter() {
        perimeter = getNumSides() * getSideLength();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "numSides=" + numSides +
                ", sideLength=" + sideLength +
                ", xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", perimeter=" + perimeter +
                '}';
    }

}