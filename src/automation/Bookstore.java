package automation;

import java.util.HashSet;

public class Bookstore {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> books=new HashSet<String>();
		
		books.add("Maths");
		books.add("Physics");
		books.add("Chemistry");
		
		if(books.contains("english"))
		{
			System.out.println("Available");
		}
		else
		{
			System.out.println("Not Available");	
		}
		for(String s:books )
		{
			System.out.println();
			System.out.println("The Book name is: "+s+" "+"and the length is: "+s.length());
		}
	}

}
