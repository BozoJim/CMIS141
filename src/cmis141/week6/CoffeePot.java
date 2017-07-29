package cmis141.week6;

import java.util.Objects;

/**
 * File: CoffeePot.java
 * Author: James Stokes
 * Date: 07-27-2017
 * Purpose: Construct a coffee pot and allow for the selection of strength, creme, and sugar.
 */

public class CoffeePot {
    private String strength;
    private boolean power = false;
    private int creme, sugar;
    private boolean complete;

    public CoffeePot() {
        this.strength = "medium";
        this.creme = 2;
        this.sugar = 2;
    }

    public CoffeePot(String strength, int creme, int sugar) {
        this.strength = strength;
        this.creme = creme;
        this.sugar = sugar;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        if (!Objects.equals(strength, "mild") && !Objects.equals(strength, "medium") && !Objects.equals(strength, "dark")) {
            System.out.println("Please choose mild, medium, or dark");
        } else {
            this.strength = strength;
        }
    }

    public boolean getPower() {
        return power;
    }

    public void setPower(boolean power) {
        if (!power) {
            System.out.println("Please turn the power on to begin your coffee.");
        } else {
            this.power = power;
        }
    }

    public int getCreme() {
        return creme;
    }

    public void setCreme(int creme) {
        if (creme < 0)
            System.out.println("You can't have negative creme. That's just silly.");
        this.creme = creme;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        if (sugar < 0)
            System.out.println("You can't have negative sugar. That's just silly.");
        this.sugar = sugar;
    }

    public void makeCoffee() {
        if (!power) {
            System.out.println("It's not doing anything.... Is it plugged in?");
        } else {
            coffeeComplete();
            this.complete = complete;
        }
    }

    private void coffeeComplete() {
        if (creme > 0 && sugar > 0) {
            System.out.format("Coffee Complete! Enjoy your %s coffee with %d creme%s and %d sugars.\n",
                    strength, creme, creme > 1 ? "s" : "", sugar, sugar > 1 ? "s" : "");
        } else if (creme == 0 && sugar > 0) {
            System.out.format("Coffee Complete! Enjoy your %s coffee with %d sugar%s.\n",
                    strength, sugar, sugar > 1 ? "s" : "");
        } else if (creme > 0 && sugar == 0) {
            System.out.format("Coffee Complete! Enjoy your %s coffee with %d creme%s.\n",
                    strength, creme, creme > 1 ? "s" : "");
        } else {
            System.out.format("Coffee complete! Enjoy your %s black coffee.\n", strength);
        }
    }

    @Override
    public String toString() {
        return "CoffeePot{" +
                "strength='" + strength + '\'' +
                ", power='" + (power ? "on" : "off") + '\'' +
                ", creme=" + creme +
                ", sugar=" + sugar +
                ", complete=" + complete +
                '}';
    }
}