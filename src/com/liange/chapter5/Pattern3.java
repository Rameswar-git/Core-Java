package com.liange.chapter5;

public class Pattern3 {

	public static void main(String[] args) {
		int no=6;
      for (int i = no; i >=1; i--) {
		   for (int j = no-i; j>=1; j--) {
			System.out.print("  ");
		   } 
		   
		   for (int m = i; m>=1; m--) {
			System.out.print(m+" ");
		   }
		   System.out.println(); 
	   }
      
	}
}
