package day37_Inheritence.ScrumTask;

public class BuinessAnalyst extends Employee{
    public BuinessAnalyst(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", id, salary, companyName);
    }

    public void analyze(){
        System.out.println(name+" does analyze the document");
    }
}
