package characterPractice;

import java.util.Scanner;

public class CommandlineInput {
	
	void TakeInput() {
		int a;
		int b, c;
		
		System.out.print("Enter the first no ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Enter the Second no");
		b=sc.nextInt();
		
		if(a>b)
			System.out.println(a +" is maximum ");
		else
			System.out.println(b +" is maximum ");
		sc.close();
	}
	


}
