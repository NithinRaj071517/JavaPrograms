package programs;

import java.util.Scanner;

public class StringContainsOnlyDigit {

	public static void main(String[] args) {
		//String input="333";
		System.out.println("Enter the String : ");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		sc.close();
		char[] ch=input.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(!Character.isDigit(ch[i]))
			{
				count=count+1;
			}
		}
		
		if(count>0)
		{
			System.out.println(input+": String not Contains Only Digit");
		}
		else
		{
			System.out.println(input+": String Contains Only Digit");
		}
	}
			
}
