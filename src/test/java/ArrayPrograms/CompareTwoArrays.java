package ArrayPrograms;

import java.util.Arrays;

public class CompareTwoArrays {
    static void main(String[] args) {
        int arr1[] ={  10, 20, 45, 67,78 };
        int arr2[] ={ 20, 10, 45, 67, 78 ,67};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
            System.out.println(" two Arrays are equal ");
        else
            System.out.println("two arrays are not equal");
    }

}
