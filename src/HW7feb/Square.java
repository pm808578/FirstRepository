package HW7feb;

public class Square {

	int i=12;
	
	int square()
	{
		return i*i;
		
	}
	public static void main(String[] args) {
		Square s=new Square();
		System.out.println("Square of a no "+s.i+" is "+s.square());

	}

}
