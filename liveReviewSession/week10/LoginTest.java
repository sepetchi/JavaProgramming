package week10;

public class LoginTest {

    public static void main(String[] args) {

    }
    public static boolean login(String username, String password){
        if (username.equalsIgnoreCase("cydeoStudent")&& password.
                equalsIgnoreCase("cydeoPassword")){
            return true;

        }
        return false;

    }

    // public static String login (String username, String password) {} !!! NOT METHOD OVERLOADING


}
