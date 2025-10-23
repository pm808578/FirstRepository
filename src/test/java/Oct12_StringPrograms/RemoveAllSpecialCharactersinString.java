package Oct12_StringPrograms;

public class RemoveAllSpecialCharactersinString {
    static void main(String[] args) {

        String str1= "Pragatiiii";
        System.out.println(str1.replaceAll("i", "e"));


        String str3= " This is pragati ";
        System.out.println(str3.replaceAll(" ", "@"));


        String str="Selenium ##%^& With&**& 12 34 455java ";
        // leave a-z and A-Z and space other than this all replace with null
        str= str.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println(str);


        // identify all the spaces \\S and repace with only one space " "
        String str5="I       am       an  Indian       Staying in Nagpur   ";
        String res="";

        res=str5.replaceAll("\\s+", " ");
        System.out.println(str5.replaceAll("\\s+", " "));

    }
}
