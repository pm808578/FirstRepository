package IQOct_19;

import java.util.Scanner;

public class CountTheOccuranceOfA {

    static void main(String[] args) {
        int count=0;
        System.out.println("Enter a sentence");   //"Amazing Apples Are Awasome"
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        for(char ch:str.toCharArray())
        {
            if (ch=='A')
            {
                count++;
            }
        }
        System.out.println(" No of Times A has occured in a string is "+count);
        }
}
