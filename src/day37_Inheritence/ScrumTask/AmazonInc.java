package day37_Inheritence.ScrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        String companyName = "AmazonInc";
        productOwner po = new productOwner("Suhaib", 29, 'M', 1, 160000, companyName);

        BuinessAnalyst ba = new BuinessAnalyst("Cihad", 30, 'M', 2, 150000, companyName);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 145000, companyName);

        Tester tester = new Tester("Chinera", 32, 'F', "QA", 1415, 125000, companyName);

    }
}