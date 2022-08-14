package day13_StringClass;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";
         char thirdChar = word.charAt(2);

       /* System.out.println("thirdChar = " + thirdChar);

        char tenthchar = word.charAt(9);*/
        System.out.println("___________________________________________________________");

String s1 = "Batch eu9 is the best batch";
int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt( s1.length() - 1);
        System.out.println("lastChar = " + lastChar);
        System.out.println("___________________________________________________________");

        String str = "wooden spoon";
        str = str.toUpperCase();

        System.out.println(str);
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println("sentence = " + sentence);






    }
}
