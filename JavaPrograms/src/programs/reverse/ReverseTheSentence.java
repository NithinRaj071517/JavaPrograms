package programs.reverse;

public class ReverseTheSentence {
	public static void main(String[] args) {
		
		String str="India is my country";
		String[] str1 = str.split(" ");
		
		String result="";
		
		for (int i = 0; i < str1.length; i++) 
		{
			result=str1[i]+" "+result;
		}
		System.out.println(result);		
	}

}
