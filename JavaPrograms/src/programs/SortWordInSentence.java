package programs;

import java.util.Arrays;

public class SortWordInSentence {

	public static void main(String[] args) {
		
		
		/**
		Method-1 Using nested for  loop iterating 
		**/
		String str="Nithin";
		char[] ch=str.toLowerCase().toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			
			}
		
		}
		System.out.print(ch);
		System.out.println();
		System.out.println("<!---------------Method-2---------->");
		/**
		Method-2 Using Array function SORT and use toString function to display values
		**/
		String st ="nithin";
		char[] ch1=st.toCharArray();
		Arrays.sort(ch1);
	
		String sorted=new String(ch1);
		System.out.println(sorted);
		
	}
}
