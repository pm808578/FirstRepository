package basicPrograms;

public class Arrays {
	
	public static void main(String[] args) {
		
		System.out.println(" Hello pragati how are you !! ");
		int arr[] = new int [4];
				arr[0]= 1;
				arr[1]= 3;
				arr[2]= 5;
				arr[3]= 16;
				int max=arr[0];
				
				System.out.println(arr);
				
				System.out.println(arr.length);
				for(int i=0; i<arr.length; i++)
				{ 

					if(max<arr[i]) {
						max=arr[i];
					}
					
				}
				System.out.println("maximum element in array is "+max);
						
	}

}
