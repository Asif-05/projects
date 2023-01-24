package automation;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;  // = symbol is an assignment  operator
				
		if(i>100)
		{
			System.out.println("The value of i is greater");// it prints the result
		}
		else if(i>200)
		{
			System.out.println("The value of i is lesser");
		}
		else if(i==100)  // == symbol is a comparison operator
		{
			System.out.println("The i value is equal to 100");
		}
		else
		{
			System.out.println("Please try again!!");
		}
	}

}
