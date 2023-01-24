package automation;

public class Arithmetics {
	
	public int add(int a,int b)
	{
		return a+b;
	}

	static private void sub(int x,int y)
	{
		int z=x-y;
		System.out.println("The subtraction value is:"+z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Arithmetics a=new Arithmetics();
     
     int sum=a.add(3, 2);
     
     
     System.out.println("The addition value is:"+sum);
	 sub(3,2);
	}

}
