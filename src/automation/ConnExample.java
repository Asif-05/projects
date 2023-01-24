package automation;

class ConnExample {
	
	String name;
	int version;

	ConnExample(String n,int ver) {
		// TODO Auto-generated constructor stub
		
		name=n;
		version=ver;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConnExample ce=new ConnExample("Java",8);
		
		System.out.println("Tech is:"+ce.name+" "+"Version is:"+ce.version);
        
		
	}

}
