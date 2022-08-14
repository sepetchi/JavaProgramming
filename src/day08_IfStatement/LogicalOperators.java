package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Aaron";
        int age = 14;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println("isEligible = " + isEligible);
        System.out.println("_________________________________________________________________________");

        String name2 = "Josh";
        int creditScore = 800;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;
        System.out.println(name2 + " is eligible for the loan:  " + isEligible2);

        System.out.println("________________________________________________________");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 +" is eligible to register: "+isEligible3);
        System.out.println("_________________________________________________________");

        String name4 = "James";

        String countryOfBirth = "UK";
        boolean marriedToUsCitizen = false;

        boolean isEligible4 = countryOfBirth == "UK" || marriedToUsCitizen == true;
        System.out.println(name4 + " is eligible to apply for US citizenship : "+ isEligible4);

        System.out.println("__________________________________________________________________");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);






    }
}
