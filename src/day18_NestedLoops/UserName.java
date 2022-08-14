package day18_NestedLoops;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your user name");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {
            for (int i = 1; i < 4; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your username");
                u = scan.next();
                System.out.println("Enter your password");
                p = scan.next();
                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Logged in");


                    break;
                }
            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.out.println("Your account is locked, please contact support team");
            }
        }
    }}/*Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}
*/