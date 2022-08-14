package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        //hourly rate, weeklyHours
        int hourlyRate = 65;
        int weeeklyHours = 45;
        int numberOfWeeks = 52;


        int salary = hourlyRate * weeeklyHours * numberOfWeeks;

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeeklyHours = " + weeeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);

        //System.out.println(salary);





    }
}
