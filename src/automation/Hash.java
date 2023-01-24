package automation;

import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> city=new HashMap<String, String>();
		
		city.put("Australia", "Canberra");
		city.put("South Africa", "Durban");
		city.put("Australia", "Canberra");
		city.put("New Zealand", "Wellington");
		
		System.out.println(city);
		
		System.out.println(city.get("Australia"));
		System.out.println("The size of hashmap is:"+city.size());
		
		for(String i:city.keySet())
		{
			System.out.println("The Country name is:"+i);
		}
		
		for(String j:city.values())
		{
			System.out.println("The Capital name is:"+j);
		}
	}

}
