package programs;

public class Factorial {

	public static void main(String[] args) {
		
		int n=20;
		int result=1;
		for (int i = 1; i <= n; i++) 
		{
			result=result*i;
		}
		
		System.out.println("The factorial of number "+n+" is "+result);
	}
}
