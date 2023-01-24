package automation;

public class Thowsexample {

	static void methods() 
	{
		System.out.println("Method Executes");
		throw new ArithmeticException("throwing arithmetic exception");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			methods();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Method caught!!");
		}
	}

}
