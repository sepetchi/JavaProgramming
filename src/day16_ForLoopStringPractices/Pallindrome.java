package day16_ForLoopStringPractices;

public class Pallindrome
{
    public static void main(String[] args) {

        String word = "Level";
        String reversed = "";

        for (int i = word.length()-1; i >=0; i--) {
            reversed += word.charAt(i);

        }
            boolean isPallindrome = word.equalsIgnoreCase(reversed);
            System.out.println("isPallindrome = " + isPallindrome);



    }
}