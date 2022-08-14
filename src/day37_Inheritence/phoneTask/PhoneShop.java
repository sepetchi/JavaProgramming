package day37_Inheritence.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 12","6.7 inches", 1000," White");

        Samsung samsung = new Samsung("galaxy s19","7inches", 900,"Black");
        Nokia nokia = new Nokia("Nokia", "brick","4 inches",50, "gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(789456123);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("-------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();
        System.out.println("------------------------------------------");

        nokia.call(911);
        nokia.text(963258741);
        nokia.selfDefense();
    }
}
