package com.tst.program2;

import java.util.Scanner;


public class FibonacieeSeries {

	public static void main(String[] args) {
		System.out.println("Enter Upto which you need to print the fibonaciee Seris");
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		int temp=0;
		int cou=1;
		int sum;
		System.out.print(0+" "+1);  
		for(int i=2;i<=no;i++){
			
//			System.out.print(" "+((i-1)+(i-2)));

			sum=temp+cou;
			temp=cou;
			cou=sum;		
			System.out.print(" "+sum);
		}
		scanner.close();

	}

}
