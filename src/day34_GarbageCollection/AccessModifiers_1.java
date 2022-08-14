package day34_GarbageCollection;

public class AccessModifiers_1 {
    public static int publicData =100;
    static int defaultData = 200;
    private static int privateData= 300;

    public static void method1(){
        System.out.println(publicData);


    }
    static  void method2(){
        System.out.println(defaultData);
    }
    private static  void method3(){
        System.out.println(privateData);
    }

    public static void main(String[] args) {

    }
}
