package automation;

public class SampleAbstract1 extends SampleAbstract{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SampleAbstract1 sa=new SampleAbstract1();
		
      sa.greeting();
	}

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("Good Evening!!");
	}

}
