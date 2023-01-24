package automation;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int[][] numbers={{2,4,6},{8,10,12}};
		 
		 for(int i=0;i<numbers.length;++i)
		 {
			 for(int j=0;j<numbers[i].length;++j)
			 {
				 System.out.println(numbers[i][j]);
			 }
		 }
		
		
	}

}
