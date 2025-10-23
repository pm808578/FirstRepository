package StringHardPrograms;

public class ReverseWordsAndPrint {
    static void main(String[] args) {

        String str= "Welcome world Pragati";   // Op-- Welcome world Pragati Pragati world Welcome
        // in this we have to reverse the string then concat with original String;
        String reverseString="";
        String sarr[]= str.split(" ");
        for(int i=sarr.length-1; i>=0; i--)
        {
            reverseString =reverseString + sarr[i]+" ";

        }
        // concatenating with original
        System.out.println(str+" "+reverseString);
    }
}
