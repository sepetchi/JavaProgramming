package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperClassExamples {
    public static void main(String[] args) {
         int i1 =100;
         Integer i2; // object
        i2 = i1; // automatically the data enlarge itself from primitive to object

        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(i1);// automatically the data enlarge itself from primitive to Object
        arrayList.add(i2);
        System.out.println("-----------ArrayList----------------------");
        System.out.println("arrayList = " + arrayList);


        Integer n1 = 300;
        int n2 = n1;// un boxing to primitive
        n2 = arrayList.get(1);// getting an object from arraylist and assiging it

        String searchResult = "1-48 of over 6000 results for java";
        String[] arr = searchResult.split("");
        System.out.println(Arrays.toString(arr));
        int resultAsPrimitive = Integer.parseInt(arr[3]);
        System.out.println(resultAsPrimitive+1);


        Integer resultAsObject = Integer.valueOf(arr[3]);
        System.out.println("resultAsObject = " + resultAsObject);



        }

    }
