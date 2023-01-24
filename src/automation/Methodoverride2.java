package automation;

public class Methodoverride2 extends Methooverride1{
	
	public void selenium()
	{
		super.automation();
		System.out.println("Selenium Testing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Methodoverride2 m=new Methodoverride2();
		
		m.selenium();
	}

}
