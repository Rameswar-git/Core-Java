package CompleteInterview;

public class RotatingArrayInplace {

	public static void main(String[] args) {
        int a2[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
         int[][] val=rotate(a2, 4);
         
         for (int i = 0; i < val.length; i++) {
			for (int j = 0; j < val[0].length; j++) {
				System.out.print(val[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] rotate(int[][] a2, int n) {
		
		for (int j = 0; j < n/2+n%2; j++) {
			for (int i = 0; i < n/2; i++) {
				int temp[]= new int[n];
				int curri=j;
				int currj=i;
				for (int k = 0; k < temp.length; k++) {
					temp[k]=a2[curri][currj];
					int[] pts=getpoints(curri,currj,n);
					curri=pts[0];
					currj=pts[1];
				}
				for (int k = 0; k < temp.length; k++) {
					a2[curri][currj]=temp[(k+(n-1))%n];
					int[] pts=getpoints(curri,currj,n);
					curri=pts[0];
					currj=pts[1];
				}
			}
		}
		
		return a2;
	}

	private static int[] getpoints(int i, int j, int n) {
		int curra=j;
		int currb=n-i-1;
		return new int[] {curra,currb};
	}

}
