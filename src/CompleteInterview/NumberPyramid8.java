package CompleteInterview;

public class NumberPyramid8 {

	public static void main(String[] args) {
		int cnot = 5;
		for (int i = 1; i < cnot; i++) {
			int printcount = 0;
			for (int j = 1; j <= i; j ++) {
				printcount=printcount+i;
				System.out.print((printcount) + " ");
			}
			System.out.println();
		}

	}

}
