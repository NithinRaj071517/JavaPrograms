package programs;



public class RemoveSpecialCharacterFromString {

	public static void main(String[] args) {
	
		String input = "Hi! @Home";
		
		String output = input.replaceAll("[^a-zA-Z ]", ""); //^ -> means NOT -- keep alphabets and remove everything
		String output1 = input.replaceAll("[a-zA-Z ]", ""); // remove alphabets and keep others everything
		System.out.println(output);
		System.out.println(output1);
	}
	
	
}
