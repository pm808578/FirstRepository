package StringHardPrograms;

import javax.xml.transform.Result;

public class ExpandTheOccurances {
    static void main(String[] args) {
        String str="a3b4c5";  // op -- aaabbbbccccc;
        String Result ="";
        for (char c:str.toCharArray())
        {
            if(Character.isAlphabetic(c) && Character.isDigit(c+1))
            {
                Result= Result+c;
            }
        }
    }
}
