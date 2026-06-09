package programs.reverse;

import java.util.Scanner;

public class ReverseSpecificWordInSentence {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index to swap:");
        int t=sc.nextInt();
		
		String str="India is my world and the country";
		String[] ch=str.split(" ");
		String rev="";
		for (int i=0;i<ch.length;i++)
		{
			if(i==t)
			{
				String temp="";
				char[] es=ch[i].toCharArray();
				for(int d=0;d<es.length;d++)
				{
					temp=es[d]+temp;
				}
			rev=rev+" "+temp;	
			}
			else
			{
				rev=rev+" "+ch[i];
			}
			
			
		}
		System.out.println(rev.trim());
		sc.close();
	}

}
