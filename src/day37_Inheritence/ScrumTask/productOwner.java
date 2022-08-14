package day37_Inheritence.ScrumTask;

public class productOwner extends Employee{

    public productOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }
    public void gatherReqs(){
        System.out.println(name+" is gathering requirements");
    }

}
