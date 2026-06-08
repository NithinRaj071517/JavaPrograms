package programs;

public class RemoveDuplicatesFromIntegerArray {

	public static void main(String[] args) {
		int[] input = {1,5,7,2,3,4,5,5,1,1,1,1,6};
		//output -->  1 5
		for (int i = 0; i < input.length; i++) 
		{
			boolean alreadyPrinted = false;

			for (int k = 0; k < i; k++) 
			{
				if (input[i] == input[k]) 
				{
					alreadyPrinted = true;
					break;
				}
			}

			if (alreadyPrinted==true) 
			{
				continue;
			}

			for (int j = i + 1; j < input.length; j++) 
			{
				if (input[i] == input[j]) 
				{
					System.out.println(input[i]);
					break;
				}
			}
		}
	}
}
