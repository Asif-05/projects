package automation;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Java";
		int version=8;
		
		if(name=="Java")     // outer statement
		{
			if(version==9)   // inner statement
			{
				System.out.println("Install Selenium");
			}
		}
		
	}

}
