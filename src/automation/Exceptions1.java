package automation;

public class Exceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int x="one";
		
		int a=10;
		try
		{
			System.out.println(a/0);	
		}
		catch(Exception e)
		{
			System.out.println("The exception is:"+e.getMessage());
			
		}
		System.out.println(a/2);
	}

}
