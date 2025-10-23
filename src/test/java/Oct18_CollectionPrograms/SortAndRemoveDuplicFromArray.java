package Oct18_CollectionPrograms;

import java.util.Set;
import java.util.TreeSet;

public class SortAndRemoveDuplicFromArray {
    static void main(String[] args) {

        int arr[]= {3, 10, 3, 20, 30, 40, 3, 4, 100, -3};

        Set<Integer> treeset= new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {

            treeset.add(arr[i]);

        }

        System.out.println(treeset);

    }
}
