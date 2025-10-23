package Oct12_StringPrograms;

public class ReverseEachWordOfString {

    static void main(String[] args) {

        String str= "Selenium with Java";

       // StringBuilder rev= new StringBuilder();
        //op ==muineleS htiw avaJ;
        for (String word:str.split(" "))
        {
           System.out.print( new StringBuilder(word).reverse().toString()+" ");
        }
        System.out.println();
        // without StringBuilder
        String str2="pragati swapnil walde";
        String  rev2="";
        String [] words=str2.split(" ");

        for (String word : words)
        {
            String revword="";
            for (int j=word.length()-1; j>=0; j--)
            {
                revword= revword+word.charAt(j);
            }
            rev2=rev2+revword+" ";
        }

        System.out.println(rev2);
    }
}
