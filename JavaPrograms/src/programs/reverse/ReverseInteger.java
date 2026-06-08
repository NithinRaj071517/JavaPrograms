package programs.reverse;


public class ReverseInteger {

	public static void main(String[] args) {
		
		int number=12345;
		String str=Integer.toString(number);
		String res="";
		
		for (int i = 0; i < str.length(); i++) 
		{
			res=str.charAt(i)+res;
		}
		
		System.out.println(res);
	}

	
}
