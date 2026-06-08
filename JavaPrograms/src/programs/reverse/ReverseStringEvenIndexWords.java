package programs.reverse;



public class ReverseStringEvenIndexWords {

	public static void main(String[] args) {
		
		String str="My name is Software Tester";
		String[] newString = str.split(" ");
		
		
		for (int i = 0; i < newString.length; i++) 
		{
			
			if(i%2==0)
			{
				StringBuffer sb = new StringBuffer(newString[i]);
				
				System.out.print(sb.reverse()+" ");
			}
		
			else
			{
				System.out.print(newString[i]+" ");
			}
			
		}
		
		
	}
}
