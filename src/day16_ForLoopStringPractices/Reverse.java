package day16_ForLoopStringPractices;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        // index:     0123456789

        String result = ""; // contains the reverse version of str

        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i); // adding each character to the result



        }
        System.out.println(result);

    }
}
