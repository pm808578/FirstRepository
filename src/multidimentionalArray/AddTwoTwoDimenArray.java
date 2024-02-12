package multidimentionalArray;

public class AddTwoTwoDimenArray {

	public static void main(String[] args) {

		int a[][]= {{2,3,4},{5,6,7}};
		int b[][]= {{10,10,10},{15,14,13}};

		int c[][]=new int [2][3];

		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}

	}
}


