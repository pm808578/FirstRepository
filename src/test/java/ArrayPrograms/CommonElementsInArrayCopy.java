package ArrayPrograms;

import java.util.*;

public class CommonElementsInArrayCopy {

    static void main(String[] args) {
        int arr1[] = {2, 19, 30,  34, 78};
        int arr2[] = { 30,  34, 78, 55};
        int totallenght= arr2.length+arr1.length;
        List<Integer> li= new ArrayList<Integer>(Arrays.asList(2, 19, 30,  34, 78));

        HashSet<Integer> hashSet= new LinkedHashSet<>();

        hashSet.addAll(li);

        for (int i = 0; i < arr2.length; i++) {
            if (!hashSet.add(arr2[i]))
                System.out.println(" duplicate elem "+arr2[i]);
        }
        System.out.println(hashSet);

    }
}
