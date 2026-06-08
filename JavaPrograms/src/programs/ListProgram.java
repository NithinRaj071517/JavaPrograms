package programs;

import java.util.*;

import java.util.Scanner;
public class ListProgram {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values in List");
        int n = sc.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println("Enter the "+n+"values in list");
        for(int i=0; i<n;i++)
        {
        	
            int h=sc.nextInt();
            list.add(h);
        }
        System.out.println("Enter number of query to perform");
        int querycount=sc.nextInt();
        
        for(int j=0;j<querycount;j++)
        {
        	System.out.println("Enter the name of query");
            String command=sc.next();
            if(command.equalsIgnoreCase("Insert"))
            {
            	System.out.println("Choose index to insert");
                int index=sc.nextInt();
                System.out.println("Choose value to insert in "+index+" Position");
                int value=sc.nextInt();
                list.add(index,value);
            }
            else if(command.equalsIgnoreCase("Delete"))
            {
            	System.out.println("Choose index to Delete");
                int delIndex=sc.nextInt();
                list.remove(delIndex);
            }
        }
        System.out.println("Final list is:");
        for(int k:list)
        {
            System.out.print(k+" ");
        }
        
        
}
}
