package programs;

public class ReplaceWordInSentence {

	public static void main(String[] args) {
		
		String str="I like Tea Much";
		String[] arr=str.split(" ");
		String src="Tea";
		String dest="Java";
		String result="";
		
		for (int i = 0; i < arr.length; i++) 
		{
			
			if(arr[i].equals(src))
			{
				
				result=result+dest+" ";
			}
			else
			{
				result=result+arr[i]+" ";
			}
			
		}
		System.out.println(result);
		
		//method-2
		
		String str1="I like Tea";
		String str2=str1.replace(src, dest);
		System.out.println(str2);
	}
}
