package com.fas.matrix;

import java.io.IOException;
import java.util.Scanner;

public class MatrixMul {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No of rows for matrix A");
		int rowA=scanner.nextInt(); 
		System.out.println("Enter No of columns of matrix A and rows for matrix B");
		int rowBAndcolA=scanner.nextInt();
		System.out.println("Enter No of Columns For Matrix B");
		int colb=scanner.nextInt();
		int[][] a=new int [rowA][rowBAndcolA];
		int[][] b=new int [rowBAndcolA][colb];
		System.out.println("Enter Values Into matrixA");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				a[i][j]=scanner.nextInt();
			}
		}
		
//		System.out.println("The values of Matrix A Are");
		
//		for(int i=0;i<a.length;i++){
//			for(int j=0;j<a[0].length;j++){
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		System.out.println("Enter Values Into matrixB");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[0].length;j++){
				b[i][j]=scanner.nextInt();
			}
		}
	  int[][] c=multiply(a,b);	
		
		for(int i=0;i<c.length;i++){
		for(int j=0;j<c[0].length;j++){
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
		scanner.close();	
}

	private static int[][] multiply(int[][] a, int[][] b) {
		int[][] c=new int[a.length][b[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b[0].length;j++){
				for(int k=0;k<a[0].length;k++){
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
			
		}
	return c;
	}
}
