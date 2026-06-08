package programs.reverse;

public class ReverseStringCharArray {
	
	public static void main(String[] args) {
		String str="hellworld";
		char[] con=str.toCharArray();
		String rev="";
		for (int i = con.length-1; i >= 0; i--) 
		{
			rev=rev+con[i];
			
		}
		System.out.println(rev);
	}

}
