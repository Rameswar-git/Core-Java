package com.liang.chapter12;

import java.util.Scanner;

public class InputMismatchExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Provide Two Numbers To find sum :: ");
		  boolean in=true; 
		  int db1=0;
		  int db2=0;
      do {
    	  try {
    		   db1=scanner.nextInt();
    		   db2=scanner.nextInt();
    		  in=false;
		  } catch (Exception e) {
			  System.out.println("Provided Valid Input and Try again");
			  scanner.nextLine();
//   		   db1=scanner.nextInt();
//   		   db2=scanner.nextInt();
		  }
    	  
       } while (in);
      
      System.out.println("Addition Of "+db1+" and"+db2+" "+(db1+db2));
      
      scanner.close();
		
	}

}
