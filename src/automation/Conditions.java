package automation;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ver=6;
		String name="Java";
		
		if(ver<8||name=="Java")	
		{
			System.out.println("Installation done for Selenium");
		}
		else
		{
			System.out.println("Check for the proper version");
		}
		
		System.out.println(!(ver>5||ver<9));
		
		String res=(ver>=8)?"Install Selenium":"Don't install Selenium";
		System.out.println(res);
		
		
		
		
	}

}
