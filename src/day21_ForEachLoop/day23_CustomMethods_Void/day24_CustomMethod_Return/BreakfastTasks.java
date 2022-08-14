package day21_ForEachLoop.day23_CustomMethods_Void.day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("Cydeo", "School"); //
        System.out.println("_________________________________");
        domain("isepetci11@gmail.com");
        System.out.println("_________________________________________");

        String[] emails = {"Josua@gmail.com", "Kamil@yahoo.com","Atiba@Cydeo.com", "gulsen@hotmail.com"};
        for (String email : emails) {
            domain(email);
            System.out.println("_________________________________________");

            nameOfMonth(5);

            //Create a method that can print the name of the day
        }

    }


    //create a method that can display the initials of a person initials (String FristNAme, String LastName)
    public static void initials(String firstName, String lastName){

        String initials = firstName.charAt(0)+"."+lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println("initials = " + initials);

    }

    //Create a method that can display the domain of the email.

    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }
    // Create a method that can display the name of the months based on the given numbers
    public static void nameOfMonth( int number) {


        String name = " ";

        if (number>= 1 && number <=12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";
        } else {
            name = "invalid";

        }
        System.out.println("Month name = " + name);
    }
}
