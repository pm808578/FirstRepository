package ArrayPrograms;

public class ArrayAscendingDescendingOrNoOrder {

    static void main(String[] args) {

        int arr[] = {2, 19, 30,  34, 78};
        boolean Ascend = true;
        boolean Descend = true;

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] > arr[i + 1])      Ascend = false;

            else if (arr[i] < arr[i + 1])    Descend = false;

        }

        if (Ascend)
            System.out.println("array is in Ascending order");
        else if (Descend)
            System.out.println("array is in Descending order");
        else {
            System.out.println(" Array is in no order");
        }
    }
}
