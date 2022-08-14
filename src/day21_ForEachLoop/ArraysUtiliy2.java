package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtiliy2 {
    public static void main(String[] args) {
        String[] students = {"Sinem", "Elif", "gunay", "Cihad", "David", "james", "Aoron", "Daniel" };
        String[] earlyBirds = Arrays.copyOf(students, 5);
        System.out.println("earlyBirds = " + Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers,4);
        System.out.println(Arrays.toString(numbers));

        System.out.println("___________________________________________________________________________");
    char[] ch1 = {'A','B','C', 'D', 'E', 'F', 'G','H','I'};
    char[] ch2 = Arrays.copyOfRange(ch1,2,5);
        System.out.println(Arrays.toString(ch2));

        int[] scores = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] result = Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));


    }



}
