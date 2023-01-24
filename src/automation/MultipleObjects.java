package automation;

public class MultipleObjects {

	String name="Java";
    
	public int add(int a,int b)
    {
    	return a+b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleObjects m=new MultipleObjects();
		MultipleObjects m1=new MultipleObjects();
		
		System.out.println(m.add(5, 4));
		System.out.println();
		System.out.println(m1.add(2, 3));
		
	}

}
