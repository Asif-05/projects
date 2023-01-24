package Testing;

import Testing.Inherit.Inherit1.Inherit3;

public class Inherit extends Access{
	
	
	final class Inherit1{
		
		public void print()
		{
			System.out.println("Java");
		}
		
	
		{
	        public void greeting()
	        {
	        	System.out.println("All the best!!");
	        }
			

		}	
			
	class Inherit3 extends Inherit1
	{
		public void testing()
		{
			System.out.println("Testing");
		}
	}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Inherit in=new Inherit();
				       
		in.greeting();
		in.automation();
	    
	
		
	}

}
