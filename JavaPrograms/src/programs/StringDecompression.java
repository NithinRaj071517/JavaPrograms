package programs;

public class StringDecompression {

	public static void main(String[] args) {
		String s1="a2b2c2d7a3";
		char[] con=s1.toCharArray();
		String rev="";
		for (int i=0;i < con.length; i++) 
		{
			
			if(Character.isDigit(con[i]))
			{
				
				for (int j = 0; j < Character.getNumericValue(con[i]); j++) 
				{
					rev=rev+con[i-1];
				}
			}
			
			
		}
		System.out.println(rev);
	}
}
