package CompleteInterview;

public class NumberPyramid11 {

	public static void main(String[] args) {
		int count = 8;
        
		for (int i = 1; i <= count; i++) {
			int tem=1;
			for (int j = count-i; j > 0; j--) {
               System.out.print("\t");
			}

			for (int m = 1 ; m <= i; m++) {
				System.out.print(tem+"\t");
				tem=tem+tem;
			}
			
			tem=tem/2;
			for (int h = tem ; h > 1 ;h=h/2) {
				System.out.print(h+"\t");
			}
			System.out.println();
		}

	}

}
