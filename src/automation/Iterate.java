package automation;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> names=new ArrayList<String>();
      
      names.add(" ");
      names.add("Ganesh");
     // names.add("Rajesh");
      
      Iterator<String> it=names.iterator();
    
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }

      
      
		
	}

}
