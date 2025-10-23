package Oct18_CollectionPrograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//  Interview Questions
public class AddFirstAndLastInArray {

    static void main(String[] args) {
        int arr[]= { 34, 45, 67, 55};

        // add 10 in the index 0 and 100 at last position in array

        LinkedList<Integer> list= new LinkedList<>(Arrays.asList(34, 45, 67, 55));

        list.addFirst(10);
        list.addLast(100);

        System.out.println(list);
    }
}
