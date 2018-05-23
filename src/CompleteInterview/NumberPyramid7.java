package CompleteInterview;

public class NumberPyramid7 {

	public static void main(String[] args) {
		int count = 6;

		for (int i = 1; i < count; i++) {
            for (int j = 1; j <= i; j++) {
				System.out.print((i+j)%2+" ");
			}
            System.out.println();
		}
	}

}
