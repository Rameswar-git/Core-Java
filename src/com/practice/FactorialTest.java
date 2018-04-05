package com.practice;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The No to find Factorial");
		int no=scanner.nextInt();
		System.out.print("factorial Of the No "+no+" is ");
		int temp=1;
		int[] arra=new int[50];
		int p=0;
		for(int i=1;i<=no;i++){
			temp=temp*i;
			arra[p]=temp;	
			p++;
		}
		System.out.print(temp);
		System.out.println();
		for(int i=0;i<arra.length;i++){
			System.out.print(arra[i]+" ");
		}
		
		scanner.close();
	}

}
