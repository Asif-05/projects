package automation;

public class Stringrev {
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Sachin";
		char[] name1=name.toCharArray();
		
		for(int i=name1.length-1;i>=0;i--)
        System.out.println(name1[i]);
	}

}
