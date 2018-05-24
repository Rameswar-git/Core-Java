package CompleteInterview;

//1	
//2	3	
//4	5	6	
//7	8	9	10	
//11	12	13	14	15	

public class NumberPyramid1 {

	public static void main(String[] args) {
		
		int c=1;
		
		int count =5;
		
		for (int i = 1 ; i <= count ; i++) {
			
			for (int j = i; j >  0 ; j -- ) {
				
				System.out.print(c+"\t");
				c++;
			}
			
			System.out.println();
			
		}

	}

}
