package Oct18_CollectionPrograms;

import java.util.*;

public class AllCollectionListSetMapEx {

    static void main(String[] args) {
        List<String> li =new ArrayList<>();

        li.add("java");
        li.add("Python");
        li.add("c#");
        li.add("SQL");
        System.out.println("ArrayList  "+li);

        Set<Object> emp=new LinkedHashSet<>();
        emp.add("Pragati");
        emp.add('F');
        emp.add(30);
        emp.add(true);
        emp.add("Pragati");
        System.out.println("HashSet  "+emp);
    }

}
