package day14_String;

import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java.";
        String str2 = str.replace("Java", "Python");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo","gmail");
        System.out.println("email = " + email);


        String sentence = "Java Java Python Python C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python","");
        System.out.println("sentence2 = " + sentence2);

        sentence2 = sentence.replace("  "," ");
        System.out.println("sentence2 = " + sentence2);

        String s3 = "Java";
        s3 = s3.replace("a","e");
        System.out.println("s3 = " + s3);
        System.out.println("___________________________________________________________________________");

        String result = "Java Java Java";
        result = result.replaceFirst("Java","Python");
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);




    }
}
