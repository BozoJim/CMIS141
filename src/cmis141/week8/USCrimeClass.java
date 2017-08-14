package cmis141.week8;

/*
 * File: USCrimeClass.java
 * Author: James Stokes
 * Date: 8-11-2017
 * Purpose: Construct a class that read a csv and print the data back out along with a count of the number of items.
 */

// import necessary packages
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

class USCrimeClass {
    private String csvFile;
    private ArrayList<String[]> columns = new ArrayList<>();

    USCrimeClass(String csvFile) {
        this.csvFile = setCsvFile(csvFile);
        this.columns = createArray();
    }

    private String getCsvFile() {
        return csvFile;
    }

    // set the csv
    private String setCsvFile(String csvFile) {
        if (csvFile.isEmpty()) {
            System.out.println("CSV can not be empty.");
        }
        return csvFile;
    }

    private ArrayList<String[]> createArray() {
        String line;
        BufferedReader bufferedReader = null;

        // Ensure csvFile is not empty. A minimum attempt at catching filename errors.
        if (!csvFile.isEmpty()) {

            // create the buffered reader from
            try {
                bufferedReader = new BufferedReader(new FileReader(csvFile));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            try {
                assert bufferedReader != null;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] thisLine = line.split(",");
                    columns.add(thisLine);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return columns;
    }

    // print an ArrayList.
    void printArray() {
        ArrayList<Integer> widths = getColumnWidths();

        for (String[] line : columns) {
            for (int i = 0; i < line.length; i++) {
                String item = line[i];
                int width = widths.get(i);
                System.out.printf("%" + width + "." + width + "s  ", item);  // column width truncated to 10 characters.
            }
            System.out.println();
        }
    }

    // find the width of the headers, used for printing the array.
    private ArrayList<Integer> getColumnWidths() {
        ArrayList<Integer> widths = new ArrayList<>();
        String[] get = columns.get(0);
        for (int i = 0; i < columns.get(0).length; i++) {
            String line = get[i];
            widths.add(line.length());
        }
        return widths;
    }

    private int desiredColumn(String search) {
        // determine the desired column based on string search.
        search = search.toLowerCase();
        int desiredColumn = 1;
        boolean success = false;
        for (int i = 0; i < columns.get(0).length; i++) {
            if (Objects.equals(columns.get(0)[i].toLowerCase(), search)) {
                desiredColumn = i;
                success = true;
                break;
            }
        }
        if (!success) System.out.println("Defaulting second column: " + columns.get(0)[1]);
        return desiredColumn;
    }

    // find growths for each year.
    private ArrayList<Double[]> getYearAndData(String search) {
        int desiredColumn = desiredColumn(search);

        ArrayList<Double[]> pg = new ArrayList<>();
        for (int i = 1; i < columns.size(); i++) {
            Double year = Double.valueOf(columns.get(i)[0]);
            Double line = Double.valueOf(columns.get(i)[desiredColumn]);
            Double[] yearLine;
            if (i > 1) {
                Double prevValue = Double.valueOf(columns.get(i - 1)[desiredColumn]);
                yearLine = new Double[]{year, line, ((line - prevValue) / prevValue) * 100};
                //System.out.println(pg.get(i).toString());
            } else yearLine = new Double[]{year, line, 0.0};

            pg.add(yearLine);
        }
        return pg;
    }

    private ArrayList<String[]> getColumns() {
        return columns;
    }

    // find and return the maximum value for the requested column
    Double[] findMax(String search) {
        int desiredColumn = desiredColumn(search);
        Double[] max = {Double.valueOf(columns.get(1)[0]), Double.valueOf(columns.get(1)[desiredColumn])};

        for (int i = 1; i < columns.size(); i++) {
            Double year = Double.valueOf(columns.get(i)[0]);
            Double line = Double.valueOf(columns.get(i)[desiredColumn]);

            if (i > 1) {

                if (line > max[1]) max = new Double[]{year, line};
            }
        }
        return max;
    }

    // find and return the minimum value for the requested column
    Double[] findMin(String search) {
        int desiredColumn = desiredColumn(search);
        Double[] min = {Double.valueOf(columns.get(1)[0]), Double.valueOf(columns.get(1)[desiredColumn])};


        for (int i = 1; i < columns.size(); i++) {
            Double year = Double.valueOf(columns.get(i)[0]);
            Double line = Double.valueOf(columns.get(i)[desiredColumn]);
            if (i > 1) {
                if (line < min[1]) min = new Double[]{year, line};
            }
        }
        return min;
    }

    // simply prints the data in an array.
    void printDataArray(String search) {
        ArrayList<Double[]> pg = getYearAndData(search);
        for (Double[] line : pg.subList(1, pg.size())) {
            System.out.printf("%4.4s: %.2f%%\n", line[0], line[2]);
        }
    }

    // lists the columns. Used for second decision in main menu.
    void listColumns() {
        System.out.println("Choose between the following case insensitive column choices:");

        String[] crimeColumns = getColumns().get(0);
        for (int i = 0; i < crimeColumns.length; i++) {
            System.out.printf("%40.40s  ", crimeColumns[i]);
            if (i % 4 == 3) System.out.println();
        }
    }

    @Override
    public String toString() {
        return "USCrimeClass{" +
                "csvFile='" + csvFile + '\'' +
                ", columns=" + columns +
                '}';
    }
} // end class