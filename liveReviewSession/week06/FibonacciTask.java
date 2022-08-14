package week06;

public class FibonacciTask {
    public static void main(String[] args) {
        /*
        noun: Fibonacci sequence
a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 Write a program to print
         Fibonacci series of n terms
         where n is declared by user :
         0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......

        This is a example of Fibonacci series of 6 terms

        term number        0    1    2    3    4    5    6  7
        Actual value    0,     1,     1,     2,     3,     5,     8  13
         */
        int count = 6, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of " + count + " numbers:");

        for (int i = 1; i <= count; ++i) {
            System.out.print(num1 + " ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;


        }
    }
}