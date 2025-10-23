package Oct12_StringPrograms;

import java.util.Arrays;

public class StringFiltering {
    static void main(String[] args) {
        String str= "a1B3c2bCA";    // op   abcABC123
        String result="";

        char crr []=str.toCharArray();
      Arrays.sort(crr);

       StringBuilder lower= new StringBuilder();
        StringBuilder upper= new StringBuilder();
        StringBuilder digits= new StringBuilder();

        for (char c: crr) {
            if (Character.isLowerCase(c)) {
                lower.append(c);
            } else if (Character.isUpperCase(c)) {
                upper.append(c);
            }else
            {
                digits.append(c);
            }
        }

        System.out.println(result+lower+upper+digits);
    }
}
