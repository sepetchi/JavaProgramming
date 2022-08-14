package day21_ForEachLoop.day23_CustomMethods_Void.day24_CustomMethod_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {
         String str = "Java";
         String result = reverse(str);
        System.out.println(result);

        if (str.equalsIgnoreCase(result)){
            System.out.println(str+" is pallindrome");
        }else {
            System.out.println(str+" is not pallindrome");
        }

    }

    public static String reverse(String str) {//"Java"
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);


        }
        return reverse;
    }

}

