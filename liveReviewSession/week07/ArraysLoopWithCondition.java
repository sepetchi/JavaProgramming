package week07;

import java.sql.SQLOutput;

public class ArraysLoopWithCondition {
    public static void main(String[] args) {
        double[] prices = {22.9,12.4,43.12,65.0,100.4,523.28,98.32,  123.11};

        for (double price : prices) {
            if (price>100.0){
                System.out.println("price = " + price);

            }


        }
        System.out.println("______________________count the prices above 50________________");

        int count = 0;
        for (double price : prices) {
            if (price > 50.0){
                count ++;
            }

        }
        System.out.println(count);
    }
}
