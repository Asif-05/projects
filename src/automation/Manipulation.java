package automation;

public class Manipulation {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String First_name="Ramesh";
		String Last_name="Kumar";
		String empid="S200";
		String pin="test@123";
		String address="23 college road";
		String code="54363";
		String num1="20";
		String num2="30";
		String tot=num1+num2;
		
		System.out.println("The length of the string variable is:"+First_name.length());
		System.out.println("The length of the string variable is:"+address.length());
		System.out.println("The Concantinated string is:"+address+" "+code);
		System.out.println("The Full name is:"+First_name.concat(Last_name));
	
		//Boolean result=First_name.equalsIgnoreCase(Last_name);
		Boolean result=First_name==Last_name;
		System.out.println("The result is:"+result);
	    		//if(First_name==Last_name)
		if(First_name.equalsIgnoreCase(Last_name))
		{
			System.out.println("Equal");
		}
			else
		{
			System.out.println("Not Equal");
		}
		System.out.println("The upper case of the string is:"+First_name.toUpperCase());
		System.out.println("The lower case of the string is:"+First_name.toLowerCase());
		System.out.println("The index position of the string is:"+address.indexOf("college"));
		System.out.println("The concantination of two numbers is:"+num1.concat(num2));
		System.out.println("The concantination of two numbers is:"+tot);
		
		
	}

}
