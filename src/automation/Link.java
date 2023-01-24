package automation;

import java.util.LinkedList;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> team=new LinkedList<String>();
		
		team.add("India");
		team.add("Australia");
		team.add("England");
		
		team.addLast("Pakistan");
		team.addLast("Sri Lanka");
		team.addFirst("South Africa");
		
	     
		for(String i:team)
		{
			System.out.println("Name of the  Team is:"+i);
			System.out.println("The length of the team is:"+i.length());
		}

	}

}
