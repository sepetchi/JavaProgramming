package Day15_ForLoop;

import java.util.Scanner;

public class SumOfNumners {


    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
            System.out.println(sum);

        }
        System.out.println("___________________________________________________________");

        Scanner scan = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            total += scan.nextInt();
        }
        System.out.println("total = " + total);

        scan.close();
    }
}
