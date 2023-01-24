package automation;

public class Staticblock {
	
	static int i;
	static int j=20;
	
	static
	{
		i=10;
		System.out.println("The static has been called");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //  Staticblock sb=new Staticblock();
      System.out.println(Staticblock.i);		
	  System.out.println("The value is: "+j);   	
		
	}

}
