package CompleteInterview;

import java.util.Scanner;

public class MatricsAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the no rows ");
		int row = scan.nextInt();
		System.out.println(" Enter The no of columns ");
		int column = scan.nextInt();
		int[][] a = new int[row][column];
		int[][] b = new int[row][column];
		System.out.println(" Enter The First Matrix ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		System.out.println(" Enter The Second Matrix ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				b[i][j] = scan.nextInt();
			}
		}

		int[][] c = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		scan.close();
	}

}
