package multidimentionalArray;

public class CopyArrayOneToOther {

	public static void main(String[] args) {
		int a[][]=new int [2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=80;
		int b[][]=new int [2][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=a[i][j];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
