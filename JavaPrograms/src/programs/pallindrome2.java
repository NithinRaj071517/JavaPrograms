package programs;



public class pallindrome2 {
	public static void main(String[] args) {
		String original="Nitin";
		String reverse="";
		for (int i = 0; i < original.length(); i++) 
		{
			reverse=original.charAt(i)+reverse;
		}
		System.out.println(reverse);
		if(reverse.equals(original))
		{
			System.out.println("ok");
		}
		else
		{
			System.out.println("not ok");
		}
		
	}
}
