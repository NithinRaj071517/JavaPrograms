package programs;

import java.util.Arrays;

public class SortCharacterInString {

	public static void main(String[] args) {
		
		 String input = "java is very easy to learn";
		 String[] words=input.split(" ");
		 
		 Arrays.sort(words);
		 for(String word:words)
		 {
			 System.out.println(word);
		 }
		
	}
}
