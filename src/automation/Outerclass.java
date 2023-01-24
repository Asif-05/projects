package automation;

public class Outerclass {
	
	static class Innerclass
	{
		int salary=10000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outerclass.Innerclass oc=new Outerclass.Innerclass();
		System.out.println("The Salary is:"+oc.salary);
		
	}

}
