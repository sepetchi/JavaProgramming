package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 95;
        if(score >=0 && score<=100) {


        if ( score>=90 && score <=100 ) {
            System.out.println("Excellent");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Great");
        } else if ( score >= 70 && score <= 79) {
            System.out.println("Good");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


    } else {
            System.out.println("Invalid Number");}
        }
}
