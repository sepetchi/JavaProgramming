package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHour = 45;
        double stateTaxRate = 0;
        double federalTaxRate = 26.2;
        int salaryBeforeTax = hourlyRate * weeklyHour * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $"+ salaryBeforeTax);
        System.out.println("State tax= $" + stateTax);
        System.out.println("Federal tax= $" + federalTax);
        System.out.println("Total tax= $"+ totalTax);
        System.out.println("Net Income= $"+ salaryAfterTax);





    }
}
