package PracticeTasks;


import java.util.Scanner;

public class StringTasks1 {
    public static void main(String[] args) {


               Scanner input = new Scanner(System.in);

               System.out.println("Enter a word:");
                String w1 = input.next();

                if (w1.substring(w1.length()-2).equals("ly")) {
                    System.out.println("Really!!!");
                }  else{
                    System.out.println("Never mind");

                    input.close();
                }


        /*ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"*/




  /*
        Ask user to enter two words. Print first word without its first
character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
         */
    }
}
