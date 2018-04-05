package com.fas.matrix;

import java.util.Scanner;

public class MatricesMulPractice {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The No Of rows for matrics 1");
      int rowA=sc.nextInt();
      System.out.println("Enter The No Columns for matrics A and Rows for Matrics B");
      int col1row2=sc.nextInt();
      System.out.println("Enter No of columns for Matrics B");
      int col2=sc.nextInt();
      int[][] a=new int[rowA][col1row2];
      int[][] b=new int[col1row2][col2];
      System.out.println("Enter elemnts into Matrics 1");
      for(int i=0;i<rowA;i++){
    	  for(int j=0;j<col1row2;j++){
    		  a[i][j]=sc.nextInt();
    	  }
      }
      System.out.println("Enter elemnts into Matrics 2");
      for(int i=0;i<col1row2;i++){
    	 for(int j=0;j<col2;j++){
    		  b[i][j]=sc.nextInt();
    	  }
      }
          int[][] c= multiply(a,b);
      
          for(int i=0;i<c.length;i++){
         	 for(int j=0;j<c[0].length;j++){
         		  System.out.print(c[i][j]+"  ");
         	  }
         	 System.out.println();
           }
      
	}

	private static int[][] multiply(int[][] a, int[][] b) {
		int[][] c=new int[a.length][b[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b[0].length;j++){
				for(int k=0;k<b.length;k++){
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
			
		
		return c;
	}
}
