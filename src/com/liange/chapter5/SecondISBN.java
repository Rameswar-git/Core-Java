package com.liange.chapter5;

import java.util.Scanner;


public class SecondISBN {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter The 12 Digit No");
          String isbn=sc.nextLine();
         if (isbn.length() != 12) {
			System.out.println(isbn+" :: is Invalid");
		 }
		int checksum=0;
		for (int i = 0; i <= isbn.length()-1; i++) {
			checksum+=Integer.parseInt(isbn.charAt(i)+"") * (i % 2 == 0 ? 3:1);
		}
		
		checksum=10-checksum % 10;
		
		System.out.println("The Final Isbn Become::"+isbn+" "+ (checksum == 10 ? 0:checksum));
		
		sc.close();
		
	}

}
