package PracticeTasks;

import java.util.Scanner;

public class StringPractice1 {



          public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a word");
            String w1 = scan.next();


            if(w1.substring(0,1).equals("x")){
                System.out.println(w1.substring(1));
            }else {
                System.out.println(w1);
            }

        }
    }






