package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        // assignment: =

        int number = 100;

        System.out.println("number = " + number); //100

        number = 200;

        System.out.println("number = " + number); //200

        String word = "Java Programming";
        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);// Wooden Spoon

        word = "Cydeo";
        System.out.println("word = " + word);// Cydeo

        word = "123"+1; //1231
        System.out.println("word = " + word);

        System.out.println("__________________________________________________________");

        //ADDITION assignment
        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x + 200);// 300
        //x = x + 200;

        System.out.println("x = " + x);
         String str = "Wooden";
         str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 += 5.5;
        System.out.println("num1 = " + num1);// num1 : 8.0

        double availableBalance = 1000.5;
        availableBalance += 300;
        //deposit 300$
        System.out.println("availableBalance = " + availableBalance);//1300.5
        System.out.println("__________________________________________________");

        //withdrawing 500$
        availableBalance -= 500; //available balance 1300.5
        System.out.println("availableBalance = " + availableBalance);
        // withdrawing $200 than depositing $400

        availableBalance -= 200; // available balance $600,
        availableBalance += 400; //available balance $400,
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("________________________________________________________________");

        double salary = 50000.5;
        System.out.println("salary = " + salary);

        salary *= 2;
        System.out.println("salary = " + salary);
        double doge = 0.00000001;
                doge *= 1000000;
        System.out.println("doge = " + doge);
        System.out.println("___________________________________________________________________");

        double num2 = 25000;
        //num2 = num2 /2:
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("______________________________________________________________________");

        double num3 = 100;
        // %=
        num3 %= 3;
        System.out.println("num3 = " + num3);
        System.out.println("_________________________________________________________________________");

        int amount = 127; // 127 cents

        int quarters = amount / 25;
        int cents = amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("__________________________________________________________________________");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);
        System.out.println("_____________________________________________________________________________");

        int y = 300;
        y %= 16;
        System.out.println("y = " + y);
        System.out.println("_____________________________________________________________________");

        int balance = 3500;
         // insurance fee $153
        balance %= 153;
        System.out.println("balance = " + balance);



















































    }
}
