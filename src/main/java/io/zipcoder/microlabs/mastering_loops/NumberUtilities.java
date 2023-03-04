package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String s = "";

        for(int i = start; i < stop; i++) {
            if(i % 2 == 0) {
                s += i;
            }
        }

        return s;
    }


    public static String getOddNumbers(int start, int stop) {
        String s = "";

        for(int i = start; i < stop; i++) {
            if(i % 2 != 0) {
                s += i;
            }
        }

        return s;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String s = "";

        for(int i = start; i < stop; i+=step) {
            s += i*i;
        }

        return s;
    }


    public static String getRange(int start) {
        String s = "";

        for(int i = 0; i < start; i++){
            s+=i;
        }

        // test one is wrong


        return s;
    }

    public static String getRange(int start, int stop) {
        String s = "";

        for(int i = start; i < stop; i++){
            s+=i;
        }


        return s;
    }


    public static String getRange(int start, int stop, int step) {
        String s = "";

        for(int i = start; i < stop; i+=step){
            s+=i;
        }


        return s;
    }



    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String s = "";

        for(int i = start; i < stop; i+=step){
            s+= (int) Math.pow(i, exponent);
        }


        return s;
    }

}
