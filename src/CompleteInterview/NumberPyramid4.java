package CompleteInterview;

public class NumberPyramid4 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0 ; j < n-i; j++) {
				
				System.out.print(" "); // if we put \t here another pattern will come 
				
			}
			
			for (int k = 0; k <= i ; k++) {
				
				System.out.print(k+" "); // if we put \t here another pattern will come 
				
			}
			
			System.out.println();
			
		}
		
	}

}
