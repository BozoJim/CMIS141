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

class USCrimeClass {
    private String csvFile;
    private FileReader readFile;

    private BufferedReader bufferedReader;
    private ArrayList<String[]> columns = new ArrayList<>();

    USCrimeClass(String csvFile) throws FileNotFoundException {
        this.csvFile = csvFile;
        this.readFile = setReadFile(getCsvFile());
        this.bufferedReader = setBufferedReader(getReadFile());
        this.columns = setColumns();
    }

    private String getCsvFile() {
        return csvFile;
    }

    private void setCsvFile(String csvFile) {
        this.csvFile = csvFile;
    }

    private FileReader setReadFile(String csvFile) {
        try (FileReader fileReader = new FileReader(csvFile)) {
            return fileReader;
        } catch (FileNotFoundException e) {
            System.out.println(csvFile + " was not found. Please input a csv file.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private FileReader getReadFile() {
        return readFile;
    }


    private BufferedReader setBufferedReader(FileReader fileReader) {
        return new BufferedReader(fileReader);
    }

    private BufferedReader getBufferedReader() {
        return bufferedReader;
    }


    private ArrayList<String[]> setColumns() {
        String line;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(csvFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            assert bufferedReader != null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] thisLine = line.split(",");
                //System.out.println(Arrays.toString(thisLine));
                columns.add(thisLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return columns;
    }

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

    private ArrayList<Integer> getColumnWidths() {
        ArrayList<Integer> widths = new ArrayList<>();
        String[] get = columns.get(0);
        for (int i = 0; i < columns.get(0).length; i++) {
            String line = get[i];
            widths.add(line.length());
        }
        return widths;
    }

    ArrayList<String[]> getColumns() {
        return columns;
    }

    @Override
    public String toString() {
        return "USCrimeClass{" +
                "csvFile='" + csvFile + '\'' +
                ", readFile=" + readFile +
                ", bufferedReader=" + bufferedReader +
                ", columns=" + columns +
                '}';
    }

} // end class