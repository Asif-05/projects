package automation;

import java.util.Scanner;

public class Banking {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	
		
		for(int i=1;i<=2;i++)
		{
		
			System.out.println("Enter username:");
			
			String name;
					
			name=sc.nextLine();
			
			System.out.println("Username is:"+name);
			
			System.out.println("Enter account number:");
			String accno=sc.nextLine();
			System.out.println("Account number is:"+accno);
			
			System.out.println("Enter deposit amount:");
			int deposit=sc.nextInt();
			System.out.println("Deposit is:"+deposit);
			
			System.out.println("Enter withdraw amount:");
			int withdraw=sc.nextInt();
			System.out.println("Enetr withdraw amount:"+withdraw);
			int balance;
			
			balance=deposit-withdraw;
			System.out.println("The balance is:"+balance);
			
		}
		
		
		
		
		
		
	}
	}


