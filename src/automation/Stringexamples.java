package automation;

public class Stringexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1="Automation Testing Selenium";
		String name2=" Using Java  ";
		String i="10";
		String j="20";
		
		System.out.println("The Length is"+name1.length());
		System.out.println("The Concatenated string is"+" "+name1.concat(name2));
		System.out.println(name1.contains("Auto"));
	    System.out.println(name1.isEmpty());
	    System.out.println(name1.indexOf('T'));
	    System.out.println("Length before trim function is:"+name2.length());
	    System.out.println("Length after trim function is:"+name2.trim().length()); // removes extra spaces before and after the string 
		System.out.println(i+j);
		System.out.println(name1.equalsIgnoreCase(name2));
	}

}
