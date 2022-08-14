package week06;

public class ForLoopPractices {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (i % 10 == 0) {
                if (i < 1000) {
                    System.out.print(i + ",");
                } else {
                    System.out.print(i);
                }
            }


        }
        System.out.println();
        System.out.println("_______________________________________________________------------------------____");

        boolean check = true;

        for (int i = 0; check; i += 10) {

            System.out.print(i + " ");

            if (i == 1000) {
                check = false;
            }
        }

        System.out.println("_____________________________________________________________________");

        int countOfEvens = 0;
        for (int i = 0; i <= 50; i++) {
            if ((i % 2) == 0) {
                ++countOfEvens;
            }
            System.out.println("countOfEvens = " + countOfEvens);

        }
    }
}