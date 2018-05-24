package CompleteInterview;

public class NumberPyramid9 {

	public static void main(String[] args) {
		int count = 7;
		for (int i = 1 ; i <= count; i++) {
          
			for (int j = count-i; j > 0; j --) {
				System.out.print("  ");
			}
			
			for (int k = i ; k > 1 ; k--) {
				System.out.print(k+" ");
			}

			for (int m = 1; m <= i ; m++) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}

}
