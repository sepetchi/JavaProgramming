package Day15_ForLoop;

public class Alphabet
{
    public static void main(String[] args) {
        /*Print:
        A~Z
        a~z
        Z~A
        z~a
         */
        //A~Z ==> 65-90 ascii table num.

        for (int i = 65; i <= 90; i++ ) { // i: 65,66,67...90
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("__________________________________________________________");

        for (char i = 'A'; i <= 'Z'; i++){ // i: A,B,C,D...Z
            System.out.print(i+" ");

            }
        System.out.println();
        System.out.println("_____________________________________________________________");

        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("_____________________________________________________________");

        //Z~A
        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("____________________________________________________________");

        for (char i = 'z'; i >= 'a'; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("___________________________________________________________");


    }

}
