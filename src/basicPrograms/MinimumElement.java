package basicPrograms;

public class MinimumElement {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 5, 50};
		//System.out.println(a.length);
		
		int min=a[0];
		for(int i=0; i<a.length; i++)
			
		{
			if(min>a[i])
				min=a[i];
		}
		
		System.out.println(" minimum element in an array is "+ min);
	}

}
