package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Mahmut";
        String lastName = "Musk";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;



        String fullName = firstName+" "+ lastName;
        //Full name of the person is______
        System.out.println("Full name of the person is " + fullName);
        //______is _____ years old
        System.out.println(fullName +" is "+ age+" years old.");
        //Full name is jobTitle, he works at companyName, and fullName's salary is____
        System.out.println(fullName + " is "+ jobTitle+ ", he works at " + companyName+", and " +fullName+ "'s salary is $"+ salary+".");



    }
}
    /* Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address
8/
}
     */
