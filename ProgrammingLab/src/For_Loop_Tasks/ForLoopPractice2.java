package For_Loop_Tasks;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {


        String result = "";
        String str = "wooden spoon";


        for (int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);

        }
        System.out.println(result);


        /*
        Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123
         */
    }
}
