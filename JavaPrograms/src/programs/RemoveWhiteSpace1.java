package programs;

public class RemoveWhiteSpace1 {
	public static void main(String[] args) {
		
		String s1="   My name is Nithin  ";
		String s2=s1.replace(" ","");
		System.out.println(s2);
		
		String s3="  ws sde is Nithin  ";
		String s4=s3.replaceAll("\\s+","");
		System.out.println(s4);
	}

}
