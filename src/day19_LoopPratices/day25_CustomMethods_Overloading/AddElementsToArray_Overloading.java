package day19_LoopPratices.day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6};
        number = addElement(number,7);

        char[] chars = {'A', 'B', 'C', 'D'};
        chars = addElement(chars,'E');

        String [] names = {"ahmet", "Mehmet", "Ali", "Veli"};
        names = addElement(names, "Layla");

        System.out.println("number = " + Arrays.toString(number));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));


    }


    //adds the given element to array; returns new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length+1];

        int i =0;
        for (int each : array){
            result[i++] = each;
        }
        result[result.length-1] = element;
        return result;

    }
    // adds the given element to array, returns new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];

        int i =0;
        for (double each : array){
            result[i++] = each;
        }
        result[result.length-1] = element;
        return result;
    }

    // adds the given element to array, returns new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];

        int i =0;
        for (String each : array){
            result[i++] = each;
        }
        result[result.length-1] = element;
        return result;
    }

    public static char[] addElement(char[] array, char element){

        char[] result = new char[array.length+1];

        int i =0;
        for (char each : array){
            result[i++] = each;
        }
        result[result.length-1] = element;
        return result;
    }


}
