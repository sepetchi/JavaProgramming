package week04;

import java.util.Scanner;

public class AdaireApartments {
    public static void main(String[] args) {

        int floorNumber = 5;
        Scanner input = new Scanner(System.in);

        System.out.println("Which Floor You Are Living?");

        floorNumber = input.nextInt();

        if (floorNumber == 1) {
            System.out.println("You are living at first floor");}
            else if (floorNumber == 2) {
                System.out.println("You are living at second floor");
            } else if (floorNumber == 3) {
                System.out.println("You are living at third floor");
            } else {
                System.out.println("There is no such floor");
            }

            {
                input.close();


            }

        System.out.println("With Switch Statements");
        // Switch statements

        switch (floorNumber){
            case 1:  // condition
                System.out.println("You are living at First Floor");  // action
                break;
            case 2:  // condition
                System.out.println("You are living at Second Floor");  // action
                break;
            case 3:  // condition
                System.out.println("You are living at Third Floor");  // action
                break;
            default:
                System.err.println("There is NO such floor");
        }


        input.close();

        }
    }






