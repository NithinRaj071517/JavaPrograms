package programs;

import java.util.Scanner;

public class fibbonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		Scanner number = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int  num = number.nextInt(); // Read a full line of text
      
		
		
		for (int i = 0; i < num; i++) 
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
			
		}
		number.close();
	}
}
