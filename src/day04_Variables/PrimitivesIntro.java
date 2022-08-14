package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //age: 38 years old

        byte age = 38;

        //weight: 160 pounds
      // byte weight = 160; 160 is out of byte's range

        short weight = 160; //160 is within the range of short code

        //salary: 100000$
        // short salary = 100000; //100000 is out of short's range
        int salary = 100000; //int is the preferred type for integer numbers

       // int asset = 3_333_333_333_333; it is out of int's range
        long asset = 3_333_333_333_333L; // use L or l at the end of the number to force compiler to get the long as a data

       char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);
        char gender = 'F';
        char grade = 'F';
        char YesNo = 'Y';
        System.out.println(YesNo);

        boolean isEmployed = true;
        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployed = " + isEmployed);
        System.out.println("grade = " + grade);





















    }
}
