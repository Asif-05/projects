package automation;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter username,empid,salary");
		
		String user=s.nextLine();
		int empid=s.nextInt();
		double salary=s.nextDouble();
		
		System.out.println("Username is: "+user);
		System.out.println("The empid is:"+empid);
		System.out.println("The Salary is:"+salary);
		
		
	}

}
