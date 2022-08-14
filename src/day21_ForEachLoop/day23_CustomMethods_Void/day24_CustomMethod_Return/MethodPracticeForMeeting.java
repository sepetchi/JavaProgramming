package day21_ForEachLoop.day23_CustomMethods_Void.day24_CustomMethod_Return;

import utilities.StringUtility;

public class MethodPracticeForMeeting {
    public static void main(String[] args) {

        System.out.println(StringUtility.reverse("Ismail"));
        System.out.println(StringUtility.reverse("Gungor"));
        System.out.println(StringUtility.isPalindrome("Anna"));
    }


    public static int max(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
                    }


    }


