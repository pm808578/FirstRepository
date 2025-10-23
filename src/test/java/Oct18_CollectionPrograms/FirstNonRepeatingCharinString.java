package Oct18_CollectionPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharinString {
    static void main(String[] args) {
            // using hasmap
        String str= "swieesstt";  // w
        char sarr[]=str.toCharArray();

        Map<Character, Integer>  map= new LinkedHashMap<>();

        for (Character c:sarr)
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        System.out.println(map);
        for (Character Key:map.keySet())
        {
            if (map.get(Key)==1) {
                System.out.println(" First single occuring  char is " + Key);
                break;
            }
        }

        // using Set
    }
}
