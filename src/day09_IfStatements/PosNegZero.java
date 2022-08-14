package day09_IfStatements;

import jdk.swing.interop.SwingInterOpUtils;

public class PosNegZero {

    public static void main(String[] args) {

        int n = 100;

        if (n > 0) {

            System.out.println("Positive");
        }
        if (n < 0) {
            System.out.println("Negative");
        }
        if (n == 0) {
            System.out.println("Zero");
        }

        System.out.println("____________________________________________________________");

        boolean positive = n > 0;
        boolean negative = n < 0;

        if (positive) {
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

    }
}


