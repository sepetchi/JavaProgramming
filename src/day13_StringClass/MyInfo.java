package day13_StringClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your gender: ");
        String gender = scan.next();
        scan.nextLine(); // we need a nextline method since the previous method is not a nextline
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        System.out.println("Enter your phone number: ");
        long phoneNumber = scan.nextLong();
        System.out.println("Enter your zip code: ");
        int zipCode = scan.nextInt();
        scan.nextLine();

        scan.nextLine();

        System.out.println("Enter your School name: ");
        String schoolName = scan.nextLine();
        System.out.println("Enter your city name: ");
        String cityName = scan.nextLine();
        System.out.println("Enter your state name: ");
        String stateName = scan.nextLine();
        System.out.println("Enter your building number: ");
        int buildingNo = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street name: ");
        String streetName = scan.nextLine();

        System.out.println("Full Name: " +fullName+"\n"+ "age: "+ age+"\n"+ "gender: "+ gender+"\n"+ "phone: "+phoneNumber+"\n");
        System.out.println( "address:  \n"+ "\t"+ buildingNo+" "+streetName+"\n"+"\t" + cityName+" "+ zipCode);





        /*
        Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)
			2. Enter your gender (String- One word ONLY)
			3. Enter your full name (String- Multiple words)
			4. Enter your phone number (long)
			5. Enter your zip code (int)
			6. Enter your School name (String- Can be Multiple words)
			7. Enter your city name (String- Can be Multiple words)
			8. Enter your state name (String- One word ONLY)
			9. Enter your building number (int)
			10. Enter your Street name

		MAKE SURE USER CAN ENTER ALL THE INPUT

		Display all the inputs that user entered in following order in sperate lines:

			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode

			6. school name
         */

    }
}
