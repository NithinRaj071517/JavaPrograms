package programs.reverse;

public class Simple {

	public static void main(String[] args) {
		int range=30;

		for(int i=1;i<=range;i++)
		{
			if(i%2==0 && i%6!=0)
			{
				System.out.println(i);
			}

		}
	}
}
