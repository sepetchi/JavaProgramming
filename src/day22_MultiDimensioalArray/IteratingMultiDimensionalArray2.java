package day22_MultiDimensioalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3}, {4,5,6,7,8},{9,10,11,12,13} };

        for (int i = arr2D.length - 1; i >= 0; i--) { // index number of one dimensional array starts from last index

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" " );

            }
            System.out.println();
        }
        System.out.println("_______________________________________________________________");

        for (int i = 0; i < arr2D.length; i++) { // indexes of each 1D array started from 0

            for (int j = arr2D[i].length - 1; j >= 0; j--) { // indexes of each element starts from last index
                System.out.print(arr2D[i][j]+" " );


            }
            System.out.println();

            System.out.println("______________________________________________________");

        }
    }
}
