package automation;

public class Student {
	
	int rollno;
	String name;
	String dept;
	

	public Student(int rollno, String name,String d) {
		// TODO Auto-generated constructor stub
		
		this.rollno=rollno;
		this.name=name;
		dept=d;
		
	}
      
	void display()
	{
		System.out.println(rollno+" "+name+" "+dept);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student(100,"Ramesh","CS");
		s.display();
	
	}

}
