package Testing;

public class DataTypes {
	
	char section='A';
	char sno='1';
	char currency='$';	
	
	byte value=-127;
	short total1=140;
	int total=950;
	long value1=12233;
	
	double mark=7.2;
	double avg=1.3;
	
	static String id="E201#$%";
	static boolean present=false;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataTypes dt=new DataTypes();
		
System.out.println("This is a character value: "+ dt.section);
System.out.println("This is an integer value: "+ dt.total);
System.out.println("This is a long value :"+dt.value1);
System.out.println("This is a short value "+dt.total1);
System.out.println("This is a byte value "+dt.value);
System.out.println("This is a double value "+dt.avg);
//System.out.println("The identity number is :"+dt.id);
System.out.println("The identity number is :"+id);
System.out.println(present);
	}

}
