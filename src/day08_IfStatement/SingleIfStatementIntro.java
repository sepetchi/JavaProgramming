package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 101;

       /* System.out.println("Odd Number");
        System.out.println("Even Number");
        */
        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber; //not even number


        if (evenNumber) { //even number

            System.out.println(number + " is even number.");
        }
        if (oddNumber) { //not even number
            System.out.println(number + " is odd number.");
        }
            System.out.println("______________________________________________________________");

            int n = 200;

            //positive
            if (n >  0){ //if the n is greater than zero than it is positive
                System.out.println(n +" is positive number");
            }
            //negative
            if (n < 0){ // if the n is smaller than zero than it is negative
                System.out.println(n +" is negative number");
            }
            //zero
            if(n == 0) { //if the n is equal to zero than it is zero
                System.out.println(n +" n is 0 ");
            }



        }

     }