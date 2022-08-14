package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));


        System.out.println("_______________________________________________________________");

        int[] scores = {95, 105, 65, 40, 85,78};
        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("min nunmer = " + scores[0]);
        System.out.println("max number = " + scores[scores.length-1]);
        System.out.println("_________________________________________________");

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words = {"ANNA", "Anna"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        System.out.println("_____________________________________________________________________________");

        int[] arr1 = {1,3,2};
        int[] arr2 = {2,3,1};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2);
        System.out.println("_______________________________________________________________________");

        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);




        }

    }

