package Testing;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("The Exception is:"+e.getMessage());
		}
		finally
		{
			System.out.println("Exception Handled Successfully!!");
		}
		System.out.println("Automation Testing");
	}

}
