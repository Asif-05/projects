package automation;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//int[] marks={87,90,78,68};
		
		String[] name={"Ramesh","Suresh","Arvind"}; 
    
        int len=name.length;
        
        for(String i:name)
        {
        	System.out.println("The array data item is: "+i);
        	
        }
        
        for(String j:name)
        {
        	int length=j.length();
        	System.out.println("The length of data item is:"+length);
        }
                   
		System.out.println("The length of the array is: "+len);
		System.out.println("The first value is:"+name[0]);
		
	}

}
