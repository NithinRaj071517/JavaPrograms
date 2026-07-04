package interviewPrograms;

public class StringDecompression {
	public static void main(String[] args) {
		String input="a2d3s3";
		char[] str=input.toCharArray();
		String result="";
		for(int i=0;i<str.length;i++)
		{
			if(Character.isDigit(str[i]))
			{
				int decompLength=Character.getNumericValue(str[i]);
				for(int j=0;j<decompLength;j++)
				{
					result=result+str[i-1];
				}
			}
		}

		System.out.println(result);

	}
}
