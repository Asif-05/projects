package automation;

public class Person {
	
	private String  name;
	
	public String getName()
	{
		return name;
	}

	public void setName(String newName)
	{
		this.name=newName;
	}
	 public static void main(String args[])
	 {
		 Person p=new Person();
		 p.setName("Sachin");
		 System.out.println(p.getName());
		 
	 }
}
