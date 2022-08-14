package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifier_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

      //  System.out.println(AccessModifier_Test4.name1);// defaut is not visible outside the package
        System.out.println(AccessModifier_Test4.name2);// protected is

       // AccessModifier_Test4.method1();
        AccessModifier_Test4.method2();

    }
}
