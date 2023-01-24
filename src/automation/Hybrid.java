package automation;

public class Hybrid {

	public void html()
	{
		System.out.println("HTML");
	}
	
	class Web extends Hybrid
	{
		public void css()
		{
			System.out.println("CSS");
		}
	}
	
	class Tech extends Web
	{
		public void js()
		{
			System.out.println("JavaScript");
		}
	}
	
		
	}


