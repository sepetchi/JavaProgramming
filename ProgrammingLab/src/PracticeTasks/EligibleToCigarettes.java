package PracticeTasks;

public class EligibleToCigarettes {
    public static void main(String[] args) {

        /* Given a number (byte) age, write a program that can check if the
        person is eligible to buy Cigarettes */
        String name = "John";

        byte age = 99;

        if (age >= 18 && age < 100) {
            System.out.println(name +" is eligible to buy cigarettes");
        } else System.out.println(name +" is not eligible to buy cigarettes");



    }
}
