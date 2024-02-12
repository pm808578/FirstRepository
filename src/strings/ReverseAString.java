package strings;

public class ReverseAString {

	public static void main(String[] args) {
		String str="PRAGATI";
		String RevStr="";

		System.out.println("original string is "+str);
		System.out.println("length of original string is "+str.length());
		System.out.println("Reverse string is "+RevStr);

		for(int i=str.length()-1;i>=0; i--)
		{
			RevStr=RevStr+str.charAt(i);
			System.out.println("Reverse string at each iteration "+RevStr);

		}

		System.out.println("New Reverse string is "+RevStr);
	}

}
