
public class we {

	public static void main(String[] args) {
		String str="India is my country";
		int revIndex=3;
		String revOutput="";
		String[] strArray=str.split(" ");

		if(revIndex>=strArray.length)
		{
			System.out.println("Given index is greater than no.of index present in sentence");
		}
		else
		{
		for (int i = 0; i < strArray.length; i++) 
		{
			if(revIndex==i)
			{
				String temp="";
				char[] ch=strArray[i].toCharArray();
				for(int j=0;j<ch.length;j++)
				{
					temp=ch[j]+temp;
				}
				revOutput=revOutput+" "+temp;
			}
			else
			{
				revOutput=revOutput+" "+strArray[i];
			}
		}
		}


		System.out.println(revOutput.trim());
	}
}
