package week05;

public class Palindrome {
    public static void main(String[] args) {

    String word = "madam";
    String result = "";
     result += word.charAt(4);
     result += word.charAt(3);
     result += word.charAt(2);
     result += word.charAt(1);
     result += word.charAt(0);


        System.out.println("result = " + result);
             

    }
}
