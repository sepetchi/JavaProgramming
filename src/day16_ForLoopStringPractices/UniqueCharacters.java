package day16_ForLoopStringPractices;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcc";
        String result = "";


        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);


        if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            result += ch;
        }
        }
        System.out.println(result);
    }
}
