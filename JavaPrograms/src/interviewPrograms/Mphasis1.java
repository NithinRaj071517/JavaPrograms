package interviewPrograms;

public class Mphasis1 {
	public static void main(String[] args) {

		//input= "I Love Java"
		//output ="avaJ evoL I"
		
		String input="I Love Java";
		char[] str=input.toCharArray();
		String result="";
		
		for(int i=0;i<str.length;i++)
		{
			char ch=input.charAt(i);
			result=ch+result;
		}
		
		System.out.println(result);
		
	}
}
