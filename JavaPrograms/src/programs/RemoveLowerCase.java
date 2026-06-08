package programs;



public class RemoveLowerCase {

	public static void main(String[] args) {

		String src = "Hi! @Home";

		String output = src.replaceAll("[a-z]", ""); //^ -> means NOT -- keep alphabets and remove everything
		System.out.println(output);


		//method-2
		String input = "Hi! TerMinat @Home";
		char[] ch=input.toCharArray();
		String red="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(!Character.isLowerCase(ch[i]))
			{
				red=red+ch[i];
			}
		}
		System.out.println(red);
	}


}
