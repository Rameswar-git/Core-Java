package CompleteInterview;


public class MatricsRotation {

	public static void main(String[] args) {
       int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};

		int[][] Transposed = new int[3][3];

			for (int j = 0; j < Transposed.length  ; j++) {
				for (int i = 0; i < Transposed[0].length; i++) {
					Transposed[j][Transposed.length-i-1]=arr[i][j];
				}
			}
			
//			for (int j = Transposed[0].length-1; j >=0  ; j--) {
//				for (int i = 0; i < Transposed.length; i++) {
//					Transposed[i][j]=arr[Transposed.length-j-1][i];
//				}
//			}
		
		System.out.println(" The Transposed Matrics is ");
		
		for (int i = 0; i < Transposed.length; i++) {
			for (int j = 0; j < Transposed[0].length; j++) {
				System.out.print(Transposed[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
