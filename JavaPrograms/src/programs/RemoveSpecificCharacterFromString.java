package programs;



public class RemoveSpecificCharacterFromString {

	public static void main(String[] args) {
	
		
		//Method -1
		String str="University";
		char[] arr=str.toCharArray();
		char rem='i';
		String result="";
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]!=rem)
			{
				result=result+arr[i];
			}
			
		}
		
		System.out.println(result);

		
		
		
		//method-2
		String input = "Clodud";
		String output = input.replace("d", "");
		System.out.println(output);
		
	}
	
	
}
