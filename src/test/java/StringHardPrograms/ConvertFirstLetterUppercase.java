package StringHardPrograms;

public class ConvertFirstLetterUppercase {

    static void main(String[] args) {

        String str="mohan is tutor";      //op Mohan Is Tutor
        String NewString="";
        for(String word:str.split(" "))
        {
            NewString=NewString + Character.toUpperCase(word.charAt(0))+ word.substring(1)+" ";
        }

        System.out.println(NewString);
    }
}
