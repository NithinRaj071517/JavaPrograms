package programs;

public class StringContainsVowels {
	
	public static void main(String[] args) {
		
		String s="ppllk";
		if(s.matches(".*[aeiouAEIOU].*"))
		{
			System.out.println("Vowels present");
		}
		else
		{
			System.out.println("not present");
		}
			
	}

}
