package CompleteInterview;


public class NumberPyramid10 {

	public static void main(String[] args) {
		int count = 6;

		for (int i = 1; i <= count; i++) {
			for (int j = count-i; j > 0; j--) {
                System.out.print("  ");
			}
			for (int m = i; m > 0; m--) {
				 System.out.print(m+" ");
			}
			System.out.println();
		}
	}

}
