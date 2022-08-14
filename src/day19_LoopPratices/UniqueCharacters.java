package day19_LoopPratices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; //bdf

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;// represents the frequency of ch

            for (int i = 0; i < str.length(); i++) {// compares the character that outer loop picked
                char each = str.charAt(i);// each character of str
                if (ch == each) {
                    count++;
                }
            }

            if (count == 1) { // if the frequency of the character is 1 than it is unique
                result += ch;
            }
        }
            System.out.println(result);



    }}









/*
Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    		ex::str = "aabccdeef";

                        output:
                                bdf
 */


