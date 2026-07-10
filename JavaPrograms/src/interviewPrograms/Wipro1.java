package interviewPrograms;


import java.util.HashMap;

public class Wipro1 {
	public static void main(String[] args) {

		

		String input="@nithinraj007";
		String str=input.replaceAll("[^a-z]", "");
		System.out.println(str);

		HashMap<Character,Integer> map=new HashMap<Character,Integer>();

		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				int time=map.get(str.charAt(i));
				map.put(str.charAt(i), time+1);
			}

			else
			{
				map.put(str.charAt(i), 1);
			}


		}
		System.out.println(map);
		 System.out.println("Vowels:");
	        for (Character ch : map.keySet()) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.println(ch + " = " + map.get(ch));
	            }
	        }
	}
}
