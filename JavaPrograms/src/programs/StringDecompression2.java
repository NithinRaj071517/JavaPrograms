package programs;

public class StringDecompression2 {

	public static void main(String[] args) {
		String a="aabbccdddddaaaccww";
		
		int count=1;
		
		for (int i=1;i <a.length(); i++) 
		{
			
			if(a.charAt(i)==a.charAt(i-1))
			{
				
				count=count+1;
			}
			else
			{
				System.out.println(a.charAt(i-1)+"-"+count);
				count=1;
			}
			
			
		}
		System.out.println(a.charAt(a.length()-1)+"-"+count);
	}
}
