package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = (byte)186;
        short b = a;
        //short b = (short)a;
        //           (short)a;
        int c = b; //implicit casting
        //int c = (int)b

        long d = c;
        //    (long)c
        float e = d;
        double f = e;
        System.out.println("----------------------------------------------------------");

        int x = 55;
        short  y = (short)x; //explicit casting
        System.out.println(x + ":"+ y);

        long j = 1000000;
        short k = (short)j;
        System.out.println(j+" : "+k);
        System.out.println("________________________________________________________________");

        double n = 10.8;
        int s  = (int) n; // 10
        System.out.println(n+" : "+s);
        System.out.println("_________________________________________________________________");

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1+" : "+s1);










    }
}
