package day21_ForEachLoop;

public class Reversed {
    public static void main(String[] args) {

        String [] names = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming","Selenium Automation", "API testing", "Database Testing", "Manuel Testing"};
        for (String each : names){
            String reversed = "";
            for (int i = each.length()-1; i >= 0 ; i--) {
                        reversed += each.charAt(i);
            }
            System.out.println(reversed);
            }
        }
    }
