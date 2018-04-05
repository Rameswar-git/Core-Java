package com.liang.chapter9;

import java.util.Scanner;

public class LocationTest {

	public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       System.out.println("Enter The No Of Rows");
       int row=scanner.nextInt();
       System.out.println("Enter The No Of Columns");
       int column=scanner.nextInt();
       double[][] arr=new double[row][column];  
       System.out.println("Enter Elemnts Into Array");
       for (int i = 0; i < row; i++) {
		   for (int j = 0; j < column; j++) {
			   arr[i][j]=scanner.nextDouble();
		  }
	   }
   
      Location location= Location.locateLargest(arr);
      
      System.out.println(location.toString());
       
       scanner.close();
       
	}

}
