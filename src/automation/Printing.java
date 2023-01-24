package automation;

import java.util.Scanner;

public class Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**	 
        String name="Asif";
		System.out.println("Welcome to Selenium "+ name);
	**/	
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the emp name,age,salary:");
		String empname=s.nextLine();
		int age=s.nextInt();
		double sal=s.nextDouble();
		
		System.out.println("The emp name is:"+empname);
		System.out.println("The age is :"+age);
		System.out.println("The Salary is:"+sal);
		
		
	}

}
