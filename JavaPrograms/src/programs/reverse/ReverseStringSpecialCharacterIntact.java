package programs.reverse;



public class ReverseStringSpecialCharacterIntact
{
	 public static void main(String[] args) 
	    {
		 String input="ahg$b+c@|:d#";
		 //String input="Nithin@Eddf%sds";
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
		 System.out.println(input);
		 System.out.println(result);
	    }

}
