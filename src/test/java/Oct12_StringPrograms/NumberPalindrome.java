package Oct12_StringPrograms;

public class NumberPalindrome {

    static void main(String[] args) {
        int num= 131;
        int orignal = num;   // store it in another var as it(num) will be shrink to zero at last
        int rev=0;
// make a reverse no and then compare
        while(num>0)
        {
            rev= ((rev*10) +(num%10));  // reverse logic
            num=num/10;
        }
        System.out.println(rev);
        if (rev == orignal)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }
}
