package Oct12_StringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ShrinkingOfStringIMP {

    static void main(String[] args) {
        String str = "aaabbbbccccc";
        //  output ---  a3b4c5
        HashMap<Character, Integer> cmap= new LinkedHashMap<>();

        for (Character c: str.toCharArray())
        {
            cmap.put(c,cmap.getOrDefault(c,0)+1);
        }

        for (Character key:cmap.keySet())
        {
            System.out.print(key+""+cmap.get(key));
        }
        System.out.println();
        System.out.println(cmap);

       /* char [] crr=str.toCharArray();
        System.out.println(Arrays.toString(crr));


        */
    }
}
