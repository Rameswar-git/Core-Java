package com.first;

/*
 * Developer Rameswar Prasad das
 */

import java.util.Scanner;

public class SubstringPrograme {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The String");
		String string=scanner.nextLine();
		System.out.println("Enter The Sub-String");
		String substring=scanner.nextLine();
		if (string.startsWith(substring)) {
			System.out.println("Welcome To "+substring);
		}
		
//		else if (string.toLowerCase().startsWith(substring.toLowerCase())) {
//			System.out.println("Substring matches irrespective of capilat or small letter");
//		}
		scanner.close();
	}

}
