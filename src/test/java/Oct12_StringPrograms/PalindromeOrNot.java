package Oct12_StringPrograms;

public class PalindromeOrNot {

    static void main(String[] args) {

        String str= "madam";

        int j=str.length()-1;
        boolean pal=false;
        // comparing the 1 st and last characters in a string
        for (int i=0; i<j;i++)
        {
            if (str.charAt(i)==str.charAt(j))
            {
                pal=true;
            }
        }

        if (pal)
            System.out.println(" String is palindrom");
        else
            System.out.println(" String is not palindrom");
    }
}
