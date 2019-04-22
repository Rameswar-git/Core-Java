package matrices_transpose;

import java.util.Scanner;

public class matricestranspose {

	public static void main(String[] args) {
		System.out.println("*************Matrices Transpose**********");
        System.out.println("Enter The No of rows for marics A");
		Scanner scanner=new Scanner(System.in);
		int rowa=scanner.nextInt();
		System.out.println("Enter The No of columns for marics A");
		int cloA=scanner.nextInt();
		int[][] matrixA=new int[rowa][cloA];
		System.out.println("enter No into the matrics A");
		for(int i=0;i<rowa;i++){
			for(int j=0;j<cloA;j++){
				matrixA[i][j]=scanner.nextInt();
			}
		}
		
		int[][] c=Transpose(matrixA,cloA,rowa);		
		System.out.println("***********Before Transpose matrics is**********");		
		for(int i=0;i<matrixA.length;i++){
			for(int j=0;j<matrixA[0].length;j++){
				System.out.print(matrixA[i][j]+" ");				
			}
			System.out.println();
		}
		System.out.println("***********After Transpose matrics is**********");		
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[0].length;j++){
				System.out.print(c[i][j]+" ");				
			}
			System.out.println();
		}
		scanner.close();
	}

	private static int[][] Transpose(int[][] matrixA, int cloA, int rowa) {
		int[][] c=new int[cloA][rowa];
		for(int i=0;i<matrixA.length;i++){
			for(int j=0;j<cloA;j++){
				c[j][i]=matrixA[i][j];
			}
		}		
		return c;
	}

}
