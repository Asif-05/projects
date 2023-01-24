package automation;

public class Solutions implements Maths{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solutions s=new Solutions(); 
		
		System.out.println(s.add());
		s.mul();
		
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		
		int c=a+b;
		return c;
		
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
	    
		System.out.println("This is multiplication");
		
	}

}
