package programs;



public class RemoveDigitsFromString {

	public static void main(String[] args) {

		String s1 = "Hi2 Thi7s m5y Ki2ng5dom";
		char[] s2=s1.toCharArray();
		String onlyString="";


		for (int i = 0; i < s2.length; i++) 
		{
			if(!Character.isDigit(s2[i]))
			{	
				onlyString=onlyString+s2[i];
			}
		}

		System.out.println(onlyString);

		//Method-2
		String input = "Ind14 ia2026";
		String output = input.replaceAll("\\d+", "");
		System.out.println(output);

		//Method-3
		String src = "Ind14 ia2026";
		String result = src.replaceAll("[^a-zA-Z ]","");
		System.out.println(result);
	}


}
