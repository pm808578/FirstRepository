package StringHardPrograms;

public class MakeFirstletterCapital {

    static void main(String[] args) {
        String str="quality assurance automation tester";
        StringBuilder res= new StringBuilder();
        String Result ="";
        // op-- " Quality Assurance Automation Tester"   logic 1

        String [] words=str.split(" ");
        for (String word : words)
        {
           char c= word.charAt(0);
           res.append(Character.toUpperCase(c)).append(word.substring(1)).append(" ");

        }
        System.out.println(res);

        //  without strinBuilder

        String [] words1=str.split(" ");
        for (String word1 : words)
        {
            char c= word1.charAt(0);
            Result = Result + Character.toUpperCase(c)+word1.substring(1)+" ";

        }
        System.out.println(Result);


    }
}
