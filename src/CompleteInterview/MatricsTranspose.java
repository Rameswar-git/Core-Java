package CompleteInterview;

import java.util.Scanner;

public class MatricsTranspose {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter The no of rows for the matrics ");
		int row = scan.nextInt();
		System.out.println(" Enter The Number of Columns for the matrics ");
		int column = scan.nextInt();

		int[][] mat = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				mat[i][j] = scan.nextInt();
			}
		}

		int[][] Transposed = new int[column][row];

		for (int i = 0; i < Transposed.length; i++) {
			for (int j = 0; j < Transposed[0].length; j++) {
				Transposed[i][j]=mat[j][i];
			}
		}
		
		System.out.println(" The Transposed Matrics is ");
		
		for (int i = 0; i < Transposed.length; i++) {
			for (int j = 0; j < Transposed[0].length; j++) {
				System.out.print(Transposed[i][j]+" ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
