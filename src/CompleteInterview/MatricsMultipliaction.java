package CompleteInterview;

import java.util.Scanner;

public class MatricsMultipliaction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter The No of rows of Matrics A ");
		int row = scan.nextInt();
		System.out.println(" Enter The No of columns of Matrics A ");
		int column = scan.nextInt();
		System.out.println(" Enter The Number of columns of Matrics B ");
		int columnb = scan.nextInt();

		int[][] A = new int[row][column];
		int[][] B = new int[row][columnb];

		System.out.println(" Please Enter The Matrics A ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				A[i][j] = scan.nextInt();
			}
		}

		System.out.println(" Please Enter The Matrics B ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < columnb; j++) {
				B[i][j] = scan.nextInt();
			}
		}

		int[][] mul = MultiplyMatrics(A, B);
		
		for (int i = 0; i < mul.length; i++) {
			for (int j = 0; j < mul[0].length; j++) {
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static int[][] MultiplyMatrics(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b[0].length];

		for (int i = 0; i < b[0].length; i++) {
           for (int j = 0; j < a.length; j++) {
			 for (int j2 = 0; j2 < a[0].length; j2++) {
				c[i][j]=c[i][j]+(a[j][j2]*b[j2][i]);
			}
		}
		}

		return c;
	}
	

}
