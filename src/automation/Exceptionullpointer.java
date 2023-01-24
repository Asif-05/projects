package automation;

public class Exceptionullpointer {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name=null;
		
		try
		{
		System.out.println(name.length());
		}
		catch(Exception e)
		{
			System.out.println("The exception is:"+e.getMessage());
		}
		finally
		{
			System.out.println("Exception handled successfully");
		}
		
	}
	}

