package com.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter The No To check For palindrome");
		Scanner scanner=new Scanner(System.in);
		int rev=0;
		int no=scanner.nextInt();
		int a=0;
		int b=no;
		while(no>0){
			a=no %10;
			rev=rev*10+a;
			no=no/10;
		}
		
		if(rev == b){
			System.out.println("Given No is Palindeome");
		}else{
			System.out.println("Given No is Not Palindeome");
		}
		scanner.close();
		

	}

}
