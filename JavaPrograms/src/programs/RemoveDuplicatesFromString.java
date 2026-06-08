package programs;



public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		String req="Beettroot";
		
		String nonDup="";
		String Dup="";
		for (int i = 0; i < req.length(); i++) 
		{
			char ch=req.charAt(i);
			if(nonDup.indexOf(ch)==-1)
			{
				nonDup=nonDup+ch;
			}
			else if(Dup.indexOf(ch)!=1)
			{
				Dup=Dup+ch;
			}
		}
		
	System.out.println("Actual string: "+req);	
	System.out.println("String Removed after Duplicate:"+ nonDup);
	System.out.println("Duplicates Character:"+Dup);
	
		
	}
}
