package day18_NestedLoops;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a = 60; // 30-7=23 23-7=16 16-7=9 9-7=2
        int b = 8;

        int count = 0; // 1+1=2 2+1=3 3+1=4
        while(a >= b){
            a -= b;
            count ++;

        }
        System.out.println(count+ " with a remainder of "+a);






    }
}
/*
        write a program that can divide two positive numbers withut using division / and multiplication *
         */