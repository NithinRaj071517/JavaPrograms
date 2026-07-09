package interviewPrograms;

import java.util.ArrayList;

public class CGI_Program1 
{
	public static void main(String[] args) {
		//Input: 58697
		//Output: [50000, 8000, 600, 90, 7]

		int input=58697;
		String str=String.valueOf(input);
		ArrayList<Integer> list=new ArrayList<Integer>();

		char[] ch=str.toCharArray();
		int lenInput=10000;
		int result=1;
		for(int i=0;i<ch.length;i++)
		{

			result=result*Character.getNumericValue(ch[i])*lenInput;
			list.add(result);
			lenInput=lenInput/10;
			result=1;
		}

		System.out.println(list);
	}
}

