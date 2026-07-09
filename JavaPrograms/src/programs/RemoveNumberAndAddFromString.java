package programs;



public class RemoveNumberAndAddFromString {

	public static void main(String[] args) {
	
		String s1 = "Hi22 Thi7s m5y Ki2ng5dom";
		char[] s2=s1.toCharArray();
		System.out.println(s2);
		int count=0;
		
		for (int i = 0; i < s2.length; i++) 
		{
			if(Character.isDigit(s2[i]))
			{	
				int dres =Character.getNumericValue(s2[i]);
				count=count+dres;
			}
		}
		
	System.out.println(count);
	}
	
	
}
