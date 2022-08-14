package week04;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double num1, num2, result;
        char operator;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two double type numbers");

        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println( " Enter arithmetic operators you want (+,-,*,/,%");
        operator = scanner.next().charAt(0);


        switch (operator){
            case '+':
                result = num1+num2;
                        break;

            case '_':
                result = num1-num2;
                        break;



        }



    }
}
