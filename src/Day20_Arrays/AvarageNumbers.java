package Day20_Arrays;

public class AvarageNumbers {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        double sum = 0; // 10+20+30+...
        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }
        double avarageNumber = sum / numbers.length;

        System.out.println("avarageNumber = " + avarageNumber);



}
}
