package cmis141.week6;

import java.awt.*;

/**
 * File: HeadPhone.java
 * Author: James Stokes
 * Date: 07-28-2017
 * Purpose: Establishes a class to create a headphone which track states such as whether it is plugged in, color,
 * manufacturer, and model.
 */

public class HeadPhone {

    // initialization of constants
    public static final int LOW = 1; // public static is necessary due to my test being in another package.
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    // initialization of variables
    private int volume = MEDIUM;
    private boolean pluggedIn = false;
    private String manufacturer;
    private Color headPhoneColor;
    private String headPhoneModel;

    // no-argument constructor
    public HeadPhone() {
        this.volume = MEDIUM;
        this.pluggedIn = false;
        this.manufacturer = "Toshiba";
        this.headPhoneColor = Color.gray;
        this.headPhoneModel = "T-850";
    }

    public HeadPhone(int volume, boolean pluggedIn, String manufacturer, Color headPhoneColor, String headPhoneModel) {
        this.volume = volume;
        this.pluggedIn = pluggedIn;
        this.manufacturer = manufacturer;
        this.headPhoneColor = headPhoneColor;
        this.headPhoneModel = headPhoneModel;
    }

    // getters and setters
    // volume
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // pluggedIn
    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    // manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // headPhoneColor
    public Color getHeadPhoneColor() {
        return headPhoneColor;
    }

    public void setHeadPhoneColor(Color headPhoneColor) {
        this.headPhoneColor = headPhoneColor;
    }

    // headPhoneModel
    public String getHeadPhoneModel() {
        return headPhoneModel;
    }

    public void setHeadPhoneModel(String headPhoneModel) {
        this.headPhoneModel = headPhoneModel;
    }

    // another volume...
    public void changeVolume(int volume) {
        this.volume = volume;
    }

    // toString that will be used for test output.
    @Override
    public String toString() {
        return "HeadPhone{\n" +
                " volume=" + volume +
                ",\n pluggedIn=" + pluggedIn +
                ",\n manufacturer='" + manufacturer + '\'' +
                ",\n headPhoneColor=" + headPhoneColor +
                ",\n headPhoneModel='" + headPhoneModel + '\'' +
                '}';
    }

} // end class