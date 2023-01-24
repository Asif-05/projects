package automation;

import java.util.HashMap;

public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> marks=new HashMap<String, Integer>();
		
		Integer i=100;
		System.out.println("The String Value is:"+i.toString().length());
		
		marks.put("C", 90);
		marks.put("C++", 92);
		marks.put("DataBase", 96);
		marks.put("DataBase", 77);
		marks.put("DataBase", 95);
		System.out.println(marks);
		
		
	}

}
