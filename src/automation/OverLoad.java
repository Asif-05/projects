package automation;

public class OverLoad {

	static public int add(int x,int y)
	{
		return x+y;
	}
	
	static public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	static private double add(double x,double y)
	{
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(add(3,2));
      System.out.println(add(31,21,10));
      System.out.println(add(3.4,2.1)); 
       
    
		
	}

}
