package programs;

public class SwapNumberToString {
	public static void main(String[] args) {
		int a=12;
		String b="Wed";
		System.out.println(a+" "+b);
		
		int temp=a;
		b=String.valueOf(a);
		a=temp;
		
		System.out.println(a+" "+b);
	}
}
