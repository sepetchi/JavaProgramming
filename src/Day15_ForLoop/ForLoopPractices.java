package Day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        for (int i = 15; i<=45; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");
        System.out.println("_____________________________________________________________");

        for (int i1 = 100; i1 >= 50; i1-- ){ //i: 100, 99, 98, 97, .....50      (>=, <=, >, < )

            System.out.print(i1+" ");
        }
        System.out.println();
        System.out.println("_________________________________________________");

        // print all the even numbers between 1~55 :2,4,6,8 .....54

        for (int i = 1; i <= 55; i++){
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        for (int i =2; i <=54; i +=2) {
            System.out.print(i+" ");

        }

    }
}
