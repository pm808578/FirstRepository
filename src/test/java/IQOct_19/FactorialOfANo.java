package IQOct_19;

import java.util.Scanner;

public class FactorialOfANo {
    static void main(String[] args) {
        System.out.println(" Enter a no to calculate Factorial");
        Scanner sc= new Scanner(System.in);
        int fact=1;

        int no=sc.nextInt();
        while(no>0)
        {
            fact=fact*no;
            no--;
        }

        System.out.println(" factorial of no  is "+fact);
    }
}
