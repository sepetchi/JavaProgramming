package Day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Alphabet2ndWay {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
            char ch = 'Z';
        for (char i = 0, j = 'Z';  i < alphabets.length ; i++, j--) {

            alphabets[i] = j;
        }
        System.out.println(Arrays.toString(alphabets));
    }

}
