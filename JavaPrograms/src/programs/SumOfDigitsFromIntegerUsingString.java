package programs;

public class SumOfDigitsFromIntegerUsingString {

	//Input number=12345
	//Output result=15
	
	public static void main(String[] args) {
		
		int number=1234567;
		String s1=String.valueOf(number);
		char[] con=s1.toCharArray();
		int count=0;
		
		for (int i = 0; i < con.length; i++) 
		{
			int b=Character.getNumericValue(con[i]);
			count=count+b;
		}
		System.out.println(count);
	}
}
