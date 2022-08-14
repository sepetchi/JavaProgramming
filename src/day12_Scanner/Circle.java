package day12_Scanner;

 import jdk.internal.access.JavaIOFileDescriptorAccess;

 import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        /*
        Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the cirlcle");

        double r = scan.nextDouble();


        double area = r * r * 3.14;
        double perimeter = 2 * r * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        scan.close();




    }
}
