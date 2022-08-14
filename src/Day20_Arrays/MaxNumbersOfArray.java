package Day20_Arrays;

public class MaxNumbersOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 0, 1};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max ){


            max = numbers[i];}



        }
        System.out.println(max);


    }
}
