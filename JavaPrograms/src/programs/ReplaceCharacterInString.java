package programs;

public class ReplaceCharacterInString {

	public static void main(String[] args) {
		
		String str="apple";
		char[] ch=str.toCharArray();
		char src='p';
		char dest='z';
		String result="";
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==src)
			{
				result=result+dest;
			}
			else
			{
				result=result+ch[i];
			}
			
		}
		System.out.println(result);
		
		//method-2
		
		String str1="apple";
		String str2=str1.replace('p', 'z');
		System.out.println(str2);
	}
}
