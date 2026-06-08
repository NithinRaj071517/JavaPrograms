package programs;

import java.util.Scanner;

public class pallindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the word:");
		String original = sc.nextLine();
		sc.close();
		String reverse="";
		for (int i =original.length() -1; i>=0; i--) 
		{
			reverse = reverse + original.charAt(i);
		}

		String o=original.toUpperCase();
		String r=reverse.toUpperCase();

		if(o.equals(r))
		{
			System.out.println("Pallindrome");
		}
		else 
		{
			System.out.println("Not Pallindrome");
		}
	}
}
