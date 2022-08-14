package day21_ForEachLoop.day23_CustomMethods_Void;

import org.w3c.dom.ls.LSOutput;

public class CustomMethodPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("________________________________________");
        helloCydeo5Times();
        System.out.println("_____________________________________________");
        evenNumbers();

    }

    // create  a function thar can print hello world 5 times
    public static void helloWorld5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World");
        }
    }

    // create a function that can print hello Cydeo 5 times
    public static void helloCydeo5Times(){

        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Cydeo");

        }
    }

    //create a function that can print all the even numbers from 1~10 ===> evenNumbers

    public static void evenNumbers() {

        for (int i = 2; i <11 ; i+=2) {
            System.out.println(i);

        }
    }
}
