package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariables {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
      //....................................................................
        int c = b; //c = 15

        b = a; //b=15
        a = c; //

        //..........................................................................//

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
