package automation;

public class ThisKeyword {

	void welcome()
	{
		System.out.println("Welcome to Automation");
	}
	
	void greeting()
	{
		System.out.println("All the Best!!");
		//welcome();
		this.welcome();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword tk=new ThisKeyword();
		
		tk.greeting();
		

	}

}
