package StringHardPrograms;

public class AddNoInAString3DigitNoCopy {

    static void main(String[] args) {

        String str = "Mgh45ng75fgg48hff3g19gbb8";
        //  op -- 45+756+48+3+19+8;
        int sum=0;
        String number="";

        for(char c :  str.toCharArray())
        {
            if (Character.isDigit(c))
            {
                number=number + c;
            }
            else if(!number.equals(""))// when the next character is not number  then we are doing the sum
            {
                sum=sum+Integer.parseInt(number);
                number="";
            }
        }
        System.out.println(sum);

    }
}
