package day10_NestedIf;

import java.sql.SQLOutput;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 400;
        if (score >= 0 && score <= 100) { //if the score is valid

            if (score >= 60) { //if the student pass the exam
                System.out.println("Passed");
            } else { //if the student failed theexam
                System.out.println("Failed");
            }
        } else { //if the score is invalid
            System.out.println("invalid score");
        }
        System.out.println("___________________________________________________________________________");

        int age = 25;
        boolean hasID = true;

        if (hasID) { //if the person has ID

            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }


        } else {
            System.out.println(" You must have an ID to buy alcohol");        }

        System.out.println("___________________________________________________________");
        int number = -1;
        if (number >=1 && number <=7) {
            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");

            } else {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Invalid Number");

                }








        }
    }


