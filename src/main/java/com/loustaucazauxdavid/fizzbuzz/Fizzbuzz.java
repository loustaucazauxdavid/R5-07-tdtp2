package com.loustaucazauxdavid.fizzbuzz;

public class Fizzbuzz {

    public static String de (int nbre) {

        if (nbre % 3 == 0 && nbre % 5 == 0) {
            return "fizzbuzz";
        }
        if (nbre % 3 == 0) {
            return "fizz";
        }
        else if (nbre % 5 == 0) {
            return "buzz";
        }
        else {
            return "" + nbre;
        }
    }
}
