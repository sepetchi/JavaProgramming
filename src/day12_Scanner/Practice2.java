package day12_Scanner;

import java.util.Scanner;


public class Practice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter true or false");
        boolean result = input.nextBoolean();
        input.close();

    }
}
