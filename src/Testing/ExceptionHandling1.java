package Testing;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks={87,90,88};
	    String name=null;
	    int num=10;
		
		try{
			System.out.println(marks[3]);
		}
		catch(Exception e)
		{
			System.out.println("The Exception is:"+e.getMessage());
		}
		     
	             
		try
		{
			System.out.println(name.length());
		}
		catch(Exception e)
		{
			System.out.println("The Exception is:"+e.getMessage());
		}
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		
		
	}

}
