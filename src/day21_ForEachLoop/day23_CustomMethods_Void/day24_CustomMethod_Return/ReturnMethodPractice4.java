package day21_ForEachLoop.day23_CustomMethods_Void.day24_CustomMethod_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        String str = "ccccccdddddaaaaabbbbbb";
        str = removeDuplicates(str);
        System.out.println(str);

    }
    //. Create a method that can rcreate a method that can remove duplciated characters from a string and returns the new value
    //					"aaabbcccc" ===> "abc"
    public static String removeDuplicates(String str) { //aaabbcccc===> "abc"

        String result = " ";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {

                result += each;
            }

        }

        return result;


    }


}
