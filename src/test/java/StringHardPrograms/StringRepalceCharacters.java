package StringHardPrograms;

public class StringRepalceCharacters {

    static void main(String[] args) {
        String str= "tomorrow";   //op  --- t3m3223w
        StringBuilder res= new StringBuilder();

        str=str.replaceAll("o", "3");
        str=str.replaceAll("r", "2");
        System.out.println(str);


    }
}
