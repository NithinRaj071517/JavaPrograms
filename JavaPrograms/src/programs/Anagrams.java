package programs;

import java.util.Arrays;



public class Anagrams {
	
	public static void main(String[] args) {
		
		
//		Scanner input = new Scanner(System.in);
//        System.out.print("Enter your String-1: ");
//        String s1 = input.nextLine();
//        System.out.print("Enter your String-2: ");
//        String s2 = input.nextLine();
		String s1="goat";
		String s2="Toag";
		
		
		
		char[] s1Array=s1.toLowerCase().toCharArray();
		char[] s2Array=s2.toLowerCase().toCharArray();
		
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		
		if(s1.length()!=s2.length())
		{
			System.out.println("The Length of the both string is not matching, so it is not anagram");
		}
		else if(Arrays.equals(s1Array, s2Array))
		{
			System.out.println("Aanagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
	}

}
