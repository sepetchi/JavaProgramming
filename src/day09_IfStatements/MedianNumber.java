package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;

                        //a=15 b=10 c=20   a=15 b=20 c=10
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        /*
            in order for a to be the median number
            1. if c is the maximum number & b is the minimum number, then a is the median number
            2. if b is the max number & c is the minimum number, then a is median number

         */
           /* In order for b is tobe median number
           1. if a is the maximum number and  c is the minimum number
           2. if c is the maximum and  a is the minimum number
            */


                        // b=15 a=20 c=10 ,       b=15 c=20 a=10
        boolean bIsMedian = (b > a && b < c) || (b < a && b > c);
        /*

         */


        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian){
            System.out.println(a + " is the median number.");}

            if(bIsMedian){
                System.out.println(b + " is the median numbar.");}

                            if(cIsMedian){
                                System.out.println(c + "is the median number."); }

            }
        }






