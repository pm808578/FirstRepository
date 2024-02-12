package basicPrograms;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int rev[]= new int [5];
		int j=0;
		for(int i=4; i>=0; i--)
		{
			
			rev[j]=a[i];
			j++;
			
		}
		
		System.out.print(" reverse of array is rev[] = ");
		for(int k=0;k<5;k++)
		{
			System.out.print(rev[k]+" ");
		}
	}

}
