package programs.reverse;



public class ReverseString {

	public static void main(String[] args) {
		
		
        String word = "Enter your String";
        String x=word.toLowerCase();
        
		StringBuilder reversed = new StringBuilder(word.toUpperCase());
		
		System.out.println(reversed.reverse().toString());
		
		StringBuffer reversed1=new StringBuffer(x);
		System.out.println(reversed1.reverse().toString());
	}
}
