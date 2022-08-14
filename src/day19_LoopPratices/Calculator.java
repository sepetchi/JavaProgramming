package day19_LoopPratices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scan.nextInt();

        System.out.println("Please enter a math operaror");
        char oparator =  scan.next().charAt(0);

        if ( !(oparator == '+' || oparator == '-')){
            System.err.println("Invalid math oparator: "+oparator);
            System.exit(0);

        }
        System.out.println("Please enter a number: ");
        int num2 = scan.nextInt();
        if (oparator == '-'){
            System.out.println(num1 - num2);
        } else {
            System.out.println(num1+num2);
        }

    }

}
