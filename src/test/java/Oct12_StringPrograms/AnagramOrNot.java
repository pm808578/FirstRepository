package Oct12_StringPrograms;

import java.util.Arrays;

public class AnagramOrNot {

    static void main(String[] args) {
        String str1= "silent";
        String str2= "listen ";

        char [] crr1=str1.toCharArray();
        char [] crr2=str2.toCharArray();

        Arrays.sort(crr1);
        Arrays.sort(crr2);

        if (Arrays.equals(crr1,crr2))
        {
            System.out.println("Strings are anagram ");
        }
        else System.out.println("Strings are not anagram ");
        System.out.println(crr1.toString());

        System.out.println(Arrays.toString(crr1));
    }
}
