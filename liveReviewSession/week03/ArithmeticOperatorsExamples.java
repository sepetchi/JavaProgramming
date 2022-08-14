package week03;

public class ArithmeticOperatorsExamples {
    public static void main(String[] args) {
        System.out.println(10/3);// in math 3.3333.. in java 3

        System.out.println(10/3.0); // 3.3333 int/double reveals double results
        System.out.println(10.0/3); // 3.3333 double/ int gives double results

        double tempInCelcius , tempInFahreneit;
        tempInCelcius = 70.2;
        tempInFahreneit = tempInCelcius *1.8 + 32;
        System.out.println("tempInFahreneit = " + tempInFahreneit);

        int a = 1;
        a = -a-- + a++ / -a-- * --a;
        System.out.println("a = " + a);
    }
}


