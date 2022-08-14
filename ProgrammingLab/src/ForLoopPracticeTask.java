import java.util.Scanner;

public class ForLoopPracticeTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 numbers: ");

        int countPos = 0;
        int countNeg = 0;

        for (int i = 0; i <5 ; i++) {
            int num = scan.nextInt();
            if( num > 0){
                countPos++;

            } else if (num < 0) {
                countNeg++;

            }

        }
        System.out.println(countPos+" positive and "+countNeg+" negative");

        scan.close();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        /*Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4*/


    }

      }

        /*Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

        */


