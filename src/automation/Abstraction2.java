package automation;

public class Abstraction2 extends Abstration1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstraction2 ab=new Abstraction2();
		
		ab.selenium();
		ab.welcome();
		
	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to test automation");
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium Testing");
		
	}

}
