package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String s = "";
        for(int i = 1; i  < numberOfRows; i++) {
            for(int j = 0; j < i; j++) {
                s+= "*";
            }
            s += "\n";
        }
        return s;
    }

    public static String getRow(int numberOfStars) {
        String s  = "";
        for(int i = 0; i < numberOfStars; i++) {
            s += "*";
        }
            return s;
    }

    public static String getSmallTriangle() {
        String s = "";

        for(int i = 1; i  < 5; i++) {
            for(int j = 0; j < i; j++) {
                s+= "*";
            }
            s += "\n";
        }
        return s;
    }

    public static String getLargeTriangle() {
        String s = "";

        for(int i = 1; i  < 10; i++) {
            for(int j = 0; j < i; j++) {
                s+= "*";
            }
            s += "\n";
        }
        return s;
    }
}
