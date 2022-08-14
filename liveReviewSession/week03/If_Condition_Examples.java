package week03;

public class If_Condition_Examples {
    public static void main(String[] args) {
        int num1, num2, num3;
        int MaxNum;
        num1 = 4;
        num2 = 8;
        num3 = 1;
        if (num1 > num2 && num1 > num3) {
            MaxNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            MaxNum = num2;
        } else {
            MaxNum = num3;
        }
        System.out.println("MaxNum = " + MaxNum);

    }
        } 
        /*
        Write Java program that will accept three numbers and return the greatest number.
• Input:
Enter first number: 4
Enter second number: 8
Enter third number: 1
• Output:
The greatest number is: 8
         */


