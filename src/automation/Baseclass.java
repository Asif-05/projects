package automation;

public class Baseclass {
	
	protected int id=100;
	String name="Ramesh";
	
	public void welcome()
	{
		System.out.println("Welcome to Automation");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Baseclass bc=new Baseclass();
     
     System.out.println(bc.id);
		
	}

}
