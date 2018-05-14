package com.GeeksforGeeks.Interview.String;

import java.util.Scanner;

public class ParanthesisChecker {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter a String To Check For Paranthesis ");
		
		String checkstring=scan.nextLine();
		
		if(checkstring.contains("(") || checkstring.contains("(")) {
			System.out.println(" The Provided String Contains Paranthesis ");
		}else {
			System.out.println(" The Provided String Does not contain any paranthsis ");
		}
		
	}
	

}
