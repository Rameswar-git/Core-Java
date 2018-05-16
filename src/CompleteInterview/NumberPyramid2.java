package CompleteInterview;

public class NumberPyramid2 {

	public static void main(String[] args) {
		
		int noofrow=5;
		
		for (int i = 1 ; i <= noofrow ; i++) {
			
			int cout=1;
			
			for (int j = i; j > 0 ; j-- ) {
				
				System.out.print(cout+" ");
				
				cout++;
				
			}
			System.out.println();
		}

	}

}
