package programs;



public class RemoveUpperCase {

	public static void main(String[] args) {

		String src = "Hi! @Hom33e";

		String output = src.replaceAll("[A-Z]", ""); 
		System.out.println(output);


		//method-2
		String input = "Hi! T2erM3inat @Home";
		char[] ch=input.toCharArray();
		String red="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(!Character.isUpperCase(ch[i]))
			{
				red=red+ch[i];
			}
		}
		System.out.println(red);
	}


}
