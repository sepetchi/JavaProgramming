package day21_ForEachLoop.day23_CustomMethods_Void.day24_CustomMethod_Return;

public class PracticeForCustomMethod {
    public static void main(String[] args) {
        eligibleToVote(17,true);

    }

    public static void eligibleToVote(int age, boolean isUSCitizen) {
        if (age >= 18 && isUSCitizen) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

    }
}
