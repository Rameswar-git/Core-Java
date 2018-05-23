package CompleteInterview;

public class NumberPyramid6 {

	public static void main(String[] args) {
		int count = 5;
		for (int i = 5; i > 0 ; i--) {
            for (int j = i; j > 0; j--) {
				System.out.print(i+"");
			}
            System.out.println();
		}
	}

}
