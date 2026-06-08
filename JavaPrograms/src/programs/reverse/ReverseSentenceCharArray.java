package programs.reverse;

public class ReverseSentenceCharArray {
	
	public static void main(String[] args) {
		String str="hellworld is my world";
		char[] ch=str.toCharArray();
		String rev="";
		for (int i=0;i<ch.length;i++)
		{
			rev=ch[i]+rev;
			
		}
		System.out.println(rev);
	}

}
