package cmis141.week5;

/**
 * File: CalendarArray.java
 * Author: Hieu Dao-Mai
 * Date: 07-20-2017
 * Purpose: Provide Java code to create and initialize an array of Java primitive type of my choice.  I pick the array name (CalendarArray) and length.
 * Demonstrate how I would determine the length of my array.  Show this through a code example I create where I use the length member.
 */

public class CalendarArray {
    // initialize empty month array
    private String[][] monthDaysArray;

    // constructor
    private CalendarArray(String[][] monthDaysArray) {
        this.monthDaysArray = monthDaysArray;
    } // end constructor

    public static void main(String[] args) {
        // create an instance of each calendar
        CalendarArray gregorianCalendar = new CalendarArray(new String[][]{{"Gregorian Calendar:",}, {"January", "31"}, {"February", "28"}, {"March", "31"}, {"April", "30"}, {"May", "31"}, {"June", "30"},
                {"July", "31"}, {"August", "31"}, {"September", "30"}, {"October", "31"}, {"November", "30"}, {"December", "31"}});
        CalendarArray mayaCalendar = new CalendarArray(new String[][]{{"Maya Haab' Calendar:",}, {"Pop", "18"}, {"Wo'", "18"}, {"Sip", "18"}, {"Sotz'", "18"}, {"Sek", "18"}, {"Xul", "18"},
                {"Yaxk'in'", "18"}, {"Mol", "18"}, {"Ch'en", "18"}, {"Yax", "18"}, {"Sak'", "18"}, {"Keh", "18"}, {"Mak", "18"}, {"K'ank'in", "18"}, {"Muwan'", "18"},
                {"Pax", "18"}, {"K'ayab", "18"}, {"Kumk'u", "18"}, {"Wayeb'", "5"}});

        // print each calendar
        gregorianCalendar.printCalendar();
        mayaCalendar.printCalendar();
    }

    private void printCalendar() {
        // Calendar name
        System.out.println(monthDaysArray[0][0]);
        //starting the for loop
        for (int i = 1; i < monthDaysArray.length; i++) {
            System.out.println("The month of " + monthDaysArray[i][0] + " has " + monthDaysArray[i][1] + " days.");
        }
        System.out.println();
    } // end printCalendar

} // end main
