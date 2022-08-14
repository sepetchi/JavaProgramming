package day19_LoopPratices;

public class PracticeOfFrequency {
    public static void main(String[] args) {
        // Write a program that can return the index number of the first unique character.
        String str = "abccdeeaaacdddb";
        String result = "";

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

                            }
        }
    }}
