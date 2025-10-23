package Oct12_StringPrograms;

public class ReverseAString {

    static void main(String[] args) {
        String str="Pragati";
        String rev="";
        for (int i=str.length()-1; i>=0; i-- )
        {
            rev=rev+str.charAt(i);
        }

        System.out.println(rev);

        // one line logic

        String str2= "Vikas";
        for (int i=str2.length()-1; i>=0; i-- )
        {
            System.out.print(str2.charAt(i));
        }
        System.out.println();

        // using StringBuilder
        String str3= "selenium";
         StringBuilder rev3= new StringBuilder(str3);
        System.out.println( rev3.reverse().toString());



    }
}
