package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
    int score = 90; // 0 - 100

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        // boolean b = score >= 80 && !a;
        boolean c = score >= 70 && score <= 79;
        // boolean c = !a && !b && score <= 70;
        boolean d = score >= 60 && score <= 69;
        boolean f = !a && !b && !c && !d;

        if(a){

        System.out.println("excellent");}

        if(b){

        System.out.println("great");}
        if (c){

        System.out.println("good");}

        if(d){


        System.out.println("passed");}
        if (f){

            System.out.println("failed");}





    }
}
/*
90 -100 excellent
80-89   great
70-79    good
60-69  passed
0-59   failed


 */