package programs;

public class DoubleEachCharacterInString {
	//Input --> "My name is Nithin"
	//Output --> MMyy  nnaammee  iiss  NNiitthhiinn
	
	public static void main(String[] args) {
		
		String s1="My name is Nithin";
		String dup="";
		char[] con= s1.toCharArray();
		for (int i = 0; i < con.length; i++) 
		{
			dup=dup+con[i]+con[i];
			
		} 
		System.out.println(dup);
	}

}
