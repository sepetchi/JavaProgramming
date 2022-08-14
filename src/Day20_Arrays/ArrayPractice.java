package Day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //store that elements : 10, 20, 50,70
        int[] numbers = {10, 20, 50, 70};
        System.out.println(Arrays.toString(numbers));
        System.out.println("________________________________________________________________");

            int[] scores = new int[5]; //[0,0,0,0,0]
            scores[1]= 85;
            scores[scores.length -1] = 95;
            scores[3] = 75;
            scores[0] = 65;
            scores[2] = 55;
        System.out.println(Arrays.toString(scores));


    }
}
