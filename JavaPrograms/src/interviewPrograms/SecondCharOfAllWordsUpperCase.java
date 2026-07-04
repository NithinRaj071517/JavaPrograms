package interviewPrograms;

public class SecondCharOfAllWordsUpperCase {
	public static void main(String[] args) {


		//output="mY nAme iS nIthin
		String input="my name is nithin";
		String[] str=input.split(" ");
		String result="";

		for(String s:str)
		{
			String[] ch=s.split("");
			for (int i = 0; i < ch.length; i++) 
			{
				if(i==1)
				{
					result=result+ch[i].toUpperCase();
					
				}
				else
				{
					result=result+ch[i];
				}

			}
			
		result=result+" ";
		}

		System.out.println(result+" ");
	}

}
