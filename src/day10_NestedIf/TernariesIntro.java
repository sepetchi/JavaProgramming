package day10_NestedIf;

import week01.SomeImportantRules;

import java.sql.SQLOutput;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if (n%2 == 0){
            System.out.println(" Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println("_______________________________________________________________________________________________________________");
        String result1 = (n%2 ==0)? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("_____________________________________________________________________________________________________________");


            int number = 100;
            String result3 = ( number> 0)? "Positive" :(number<0) ? "negative" : "Zero";
        System.out.println(result3);
            
        }
    }


