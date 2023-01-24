package automation;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] i={30,20,45};
		
		String[] teams={"India","Australia","England"};
		
		for (int numbers:i)
		{
			System.out.println("The value is"+numbers);
		}
        System.out.println();
        for (String j:teams)
        {
        	System.out.println("The team name is:"+j);
        }
		
	}

}
