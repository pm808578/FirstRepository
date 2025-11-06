package ArrayPrograms;

import java.util.Arrays;

public class Merge2ArraysCopy {
    static void main(String[] args) {

        int arr1[] = {2, 19, 30,  34, 78};

        int arr2[] = { 30,  34, 78, 55};

        int len= arr1.length + arr2.length;

        int [] arr3= new int[len];

        for (int i = 0; i <arr1.length ; i++) {
            arr3[i]=arr1[i];

        }
        for (int j = 0; j< arr2.length; j++) {

            arr3[arr1.length+j]= arr2[j];   // important line  array 1 ki lenth me 1 1 add kare
        }
        System.out.println(Arrays.toString(arr3));
    }
}
