package interviewPrograms;

public class Mphasis2 {
	public static void main(String[] args) {

		//input= "I Love Java"
		//output ="Java Love I"
		
		String input="I Love Java";
		String[] str=input.split(" ");
		String result="";
		
		for(String s:str)
		{
			result=s+" "+result;
		}
		
		System.out.println(result);
		
	}
}
