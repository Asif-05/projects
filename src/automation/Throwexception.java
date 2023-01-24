package automation;

public class Throwexception {

	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   
		int empid=10;
		
		if(empid<100)
		{
			throw new Exception("Vales should be higher than 100");
		}
		else
		{
			System.out.println("Correct Entry");
		}
		
		
	}

}

