package Day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String [] myGroup = new String[5];
        myGroup[0] = "Hulya";
        myGroup[1] = "Gunay";
        myGroup[2] = "Neira";
        myGroup[3] = "Suat";
        myGroup[4] = "Mikael";
        System.out.println(Arrays.toString(myGroup));

        System.out.println("__________________________________________________________________");

        String [] days = {"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        System.out.println(Arrays.toString(days));

        int number =5;
        if (number < 1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);

        }
        System.out.println(days[number -1]);
    }
}
