package programs;

public class DoubleEachCharacterInString2 {
	//Input --> "My name is Nithin"
	//Output --> MMyy  nnaammee  iiss  NNiitthhiinn
	
	public static void main(String[] args) {
		
		String s1="My name is Nithin";
		String[] s2=s1.split(" ");
		
		
		String dup="";
		for (int i = 0; i < s2.length; i++) 
		{
			dup=dup+s2[i]+s2[i];
			
		} 
		System.out.println(dup);
	}

}
