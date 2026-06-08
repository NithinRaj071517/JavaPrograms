package programs;

import java.util.ArrayList;

import java.util.List;

public class OddOrEvenInList {

	public static void main(String[] args) {
		
		int[] numbers= {2,5,6,12,33,323112,88,97,46};
		List<Integer> odd=new ArrayList<>();
		List<Integer> even=new ArrayList<>();
		 
		
		
		for (int i = 0; i < numbers.length; i++) 
		{
			if(numbers[i]%2==0)
			{
				even.add(numbers[i]);
			}
			else
			{
				odd.add(numbers[i]);
			}
			
		}
		
		System.out.println(even);
		System.out.println(odd);
	}
}
