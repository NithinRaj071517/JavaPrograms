package programs;



public class ReverseStringSpecialCharacterIntact
{
	 public static void main(String[] args) 
	    {
		 String input="Nithin@Eddf%sss";
		 String word="";
		 String result="";
		 
		
		 for(int i=0;i<input.length();i++)
		 {
			 char ch=input.charAt(i);
			 if(Character.isAlphabetic(ch))
			 {
				 word=ch+word;
			 }
			 else
			 {
				 result=result+word+ch;
				 word="";
			 }
		 }
		 result=result+word;
		 System.out.println(result);
	    }

}
