package basicPrograms;

public class SumOfAllArray {

	public static void main(String[] args) {
		int a[]= {50, 60, 40, 20};
		int sum=0;
		
		for (int i=0; i<a.length; i++)
			
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum); 
		
		System.out.println(a);
		
		System.out.println(a.toString());

	}

}
