package StringHardPrograms;

public class AddNumbersInAString {

    static void main(String[] args) {
        String str="Mghwuenng7fgg4hhff3gf9gbb8";
        //op  --- 7+4+3+9+8==
        System.out.println(7+4+3+9+8);
        int sum=0;
        for (char c:str.toCharArray())
        {
            if (Character.isDigit(c))
            {
                sum=sum+Character.getNumericValue(c);

                //sum=sum+Integer.parseInt(String.valueOf(c));

            }
        }

        System.out.println(sum);
    }
}
