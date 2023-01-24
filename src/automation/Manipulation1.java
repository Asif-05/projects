package automation;

public class Manipulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String greeting="All the Best";
		String sample=" ";
		String message=" Hello How are you? ";
		String tr=message.trim();
		char[] name={'j','a','v','a'};
		String s=new String(name);
		
		boolean e=greeting.isEmpty();
		boolean samp=sample.isEmpty();
		
		System.out.println("The character array is converted to string as:"+s);
		
		System.out.println("The sub string is:" +greeting.substring(4));
		System.out.println("The sub string is:" +greeting.substring(8, 12));
		System.out.println("The string is present:"+greeting.contains("the"));
		System.out.println("The string length before using trim function is:" +message.length());
		System.out.println("The string length after using trim function is:" +tr.length());
		System.out.println("Is the string is empty?:" +e);
		System.out.println("The replaced string is:"+ message.replace("Hello", "Hi"));
		System.out.println("Is sample string is empty?:" +samp);
		System.out.println("The length is sample string is?:" +sample.length());
		
		
		
	}

}
