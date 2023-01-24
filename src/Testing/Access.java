package Testing;

public class Access {
	
  	 private void welcome()
  	{
		System.out.println("Welcome to Java");
	}
	
  	 public int add(int a,int b)
  	 {
  		 return a+b;
  	 }
	public void greeting()
	{
		System.out.println("Good Evening!!");
	}
		protected void automation()
	{
	System.out.println("Automation Testing");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access a=new Access();

		a.welcome();
		a.automation();
		a.greeting();
		System.out.println(a.add(5, 4));
		System.out.println(a.add(7, 8));
		
		
	}

}
