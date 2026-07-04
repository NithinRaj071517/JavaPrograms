package interviewPrograms;

public class RemoveIntegerFromStringAndCOunt {
	public static void main(String[] args) 
	{
		String input="SFFW321!#$@#$@433";
		String str=input.replaceAll("[^0-9]", "");
		
		int number=Integer.valueOf(str);
		
		int result=0;
		
		while (number>0)
		{
			int rem=number%10;
			result=result+rem;
			number=number/10;
			
			
		}
		
		System.out.println(result);
	}
}
