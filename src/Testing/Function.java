package Testing;

public class Function {

	public void greetings()
	{
		
		System.out.println("Good Evening!!!");
	}
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Function f=new Function();
		
		f.greetings();
		
		int c=add(2,3);
		int d=add(5,4);
		System.out.println("The addition value is: "+c);
		System.out.println("The addition value is: "+d);
		
		
	}

}
