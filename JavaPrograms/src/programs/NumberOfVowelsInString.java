package programs;

public class NumberOfVowelsInString {

	public static void main(String[] args) {
		
		String str="Automation";
		str=str.toLowerCase();
		char[] con=str.toCharArray();
		int vowels=0;
		int consonants=0;
		for (int i = 0; i < con.length; i++) 
		{
			if(con[i]=='a'||con[i]=='e'||con[i]=='i'||con[i]=='o'||con[i]=='u')
			{
				vowels=vowels+1;
				
			}
			else
			{
				consonants=consonants+1;
			}
		}
		System.out.println("The number of vowels: "+vowels);
		System.out.println("The number of consonants: "+consonants);
	}
}
