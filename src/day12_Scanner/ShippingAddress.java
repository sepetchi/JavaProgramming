package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your bulding number: ");
        String building = input.next();
        input.nextLine();

        System.out.println("Enter your street number: ");
        String streetNumber = input.nextLine();

        System.out.println("enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your State name: ");
        String state = input.next();

        System.out.println("Enter your zip code: ");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter your country name: ");
        String country = input.nextLine();

        System.out.println(fullName + "\n" + zipCode + " " + streetNumber+ "\n" +  country+" "+ state);

        input.close();




    }
}
