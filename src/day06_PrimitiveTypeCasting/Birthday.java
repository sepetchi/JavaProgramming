package day06_PrimitiveTypeCasting;

public class Birthday {
    public static void main(String[] args) {
        String name = "John";
        int birthDay = 26;
        String birthMonth = "May";
        int birthYear = 1981;

        System.out.println(name+ " was born on "+ birthMonth+"/"+birthDay+"/"+birthYear+".");
        System.out.println("___________________________________________________________");

        //My favorite book is "bookname"

        String bookName = "The Rich Dad and The Poor Dad";
        System.out.println("My favorite book is "+"\""+ bookName+"\".");


       /* Create a class named BirthDay and create the following variable
                name, birthDay(int), birthMonth(String), birthYear(int)

        use concatenation to display the birthday of the person

        if  name = "John"
        birthDay = 25
        birthMonth = "April"
        birthYear = 1995;

        output:
        John was born on April/25/1995.*/
    }
}
