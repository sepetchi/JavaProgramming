package day21_ForEachLoop.day23_CustomMethods_Void;


import utilities.ArraysUtility;

import javax.swing.text.Utilities;

public class PrintOddNumbers1To100 {
    public static void main(String[] args) {
        printOddNumbers();
    }
    public static void printOddNumbers(){
        for (int i = 0; i <100 ; i++) {
            if (i % 2!=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }




}

