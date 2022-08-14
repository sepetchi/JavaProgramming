package PracticeTasks;

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a char and a String");
        String str = scan.next();
        char ch = scan.next().charAt(0);

        int frequency = 0;
        for (int i =0; i < str.length(); i++){
            char eachChar = str.charAt(i);
            if (eachChar==ch){
                frequency ++;
            }
        }
        System.out.println(frequency);
        scan.close();

    }
}
