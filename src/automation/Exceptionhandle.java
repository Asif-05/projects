package automation;

public class Exceptionhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] i={23,43,55};
		
		try
		{
		System.out.println(i[3]);
		}
		catch(Exception e)
		{
			System.out.println("The Exception is:"+e.getMessage());
	    }
		finally
		{
			System.out.println("Access the array value under the limit");
		}
		
		

	}

}
