package programs;



public class RemoveNumberAndAddFromSentence {
	 public static void main(String[] args) 
	    {
		 String input="raju salary 20000, somu salary is 30000 and prakash salary is 45000. print total salary and avg salary";
		 
		 String s1=input.replaceAll("[^0-9]","");
		 String[] str=s1.split(" ");
		
		 int sum=0;
		 for(String st:str)
		 {
			 if(st.matches("\\d+"))
			 {
				 sum=sum+Integer.parseInt(st);
			 }
			
		 }
		System.out.println(sum);
	    }

}
