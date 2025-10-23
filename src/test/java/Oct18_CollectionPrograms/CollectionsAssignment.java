package Oct18_CollectionPrograms;

import java.util.*;

public class CollectionsAssignment {
    static void main(String[] args) {
        // Arrays.asList is fixed-size  so we  can not add new item in list

            List<String> list = Arrays.asList("a", "b", "c");
            list.set(1, "x");
            System.out.println(list);  // op a x  c
        try {
            list.add("d"); // Guess the output
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
            System.out.println(list);

        // Program 2: HashSet ignores duplicates & allows only one null
            Set<String> set = new HashSet<>(Arrays.asList("a", "b", "a", null, null));
            System.out.println(set.size());
            System.out.println(set.contains("a"));
            System.out.println(set.contains(null));

        //Program 3: LinkedHashSet preserves insertion order

            Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(3, 1, 2, 1, 3));
            System.out.println(set2);

        }

    }

