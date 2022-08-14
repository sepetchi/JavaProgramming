package day34_GarbageCollection;

public class AccessModifiers {

    public static int publicData = 100;
    public static int defaultData = 200; // default access modifier
    private static int privateData = 300;

    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(privateData);
        System.out.println(defaultData);
    }




}
