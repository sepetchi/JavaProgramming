package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallTasksWithArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("numbers = " + numbers);
        numbers.set(numbers.size()-1,0);
        System.out.println("numbers = " + numbers);


        //write a method that can multiply each add number by 2 in an arrayList



        }
    }

