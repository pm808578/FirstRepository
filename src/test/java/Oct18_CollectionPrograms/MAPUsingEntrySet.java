package Oct18_CollectionPrograms;

import java.util.HashMap;
import java.util.Map;

public class MAPUsingEntrySet {

    static void main(String[] args) {
        Map<String, Integer> map= new HashMap<>();

        map.put("Pragati", 98);
        map.put("Vikas", 95);
        map.put("Juganu", 45);
        map.put("Rupali", 89);

        System.out.println(map);

        for(Map.Entry< String, Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

    }
}
