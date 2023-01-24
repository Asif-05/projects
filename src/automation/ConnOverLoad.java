package automation;

public class ConnOverLoad {
	
	String tech;

	 ConnOverLoad() {
		// TODO Auto-generated constructor stub
		this.tech="Java";
	}

	 ConnOverLoad(String tech)
	 {
		 this.tech=tech;
	 }
	public void getName()
	{
		System.out.println("Technology is:"+this.tech);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ConnOverLoad col=new ConnOverLoad();  // default
 
 ConnOverLoad col1=new ConnOverLoad("Python");// passing arguement to the constructor
 
 col.getName();
 col1.getName();
		
	}

}
