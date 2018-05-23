package CompleteInterview;

public class NumberPyramid5 {

	public static void main(String[] args) {
        int count=5;
        
        for (int i = 0; i < 5; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
