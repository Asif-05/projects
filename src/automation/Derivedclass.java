package automation;

public class Derivedclass extends Baseclass{
	
	int a=10;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Derivedclass dc=new Derivedclass();
		
		dc.welcome();
		System.out.println("The identity number is:"+dc.id);
		System.out.println("The name is:"+dc.name);
	}

}
