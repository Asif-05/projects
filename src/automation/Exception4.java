package automation;

public class Exception4 {
	
	public static void value(int i)
	{
		
	if(i<100)
	{
		throw new ArithmeticException("Value is lesser than 100");
	}
	else
	{
		System.out.println("Correct value");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		value(42);
		value(104);
		
		
	}

}
