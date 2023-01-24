package automation;

public class Hierarchical {
	
	void greeting1()
	{
		System.out.println("good morning");
	}

	class Selenium extends Hierarchical
	{
		void automation()
		{
			System.out.println("Automation Testing");
		}
	}
	
	class Programming extends Hierarchical
	{
		void java()
		{
			System.out.println("Java Programming");
		}
	}
	
	 class Programming1{
		
	    
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
			
		Programming pr=new Programming();
		pr.greeting1();
		
		
	}

}
}