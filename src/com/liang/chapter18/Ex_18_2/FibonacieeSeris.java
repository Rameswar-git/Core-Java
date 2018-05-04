package com.liang.chapter18.Ex_18_2;

import java.util.Scanner;

public class FibonacieeSeris {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter The No To print the fibonaciee Seris :: ");
		int no = scn.nextInt();

		int temp1 = 0;
		int temp2 = 1;

		System.out.print(" Fibonaciee Seris Upto " + no + " is " + temp1 + " " +temp2);

		for (int i = 2; i <= no; i++) {
       	 int tem=temp1+temp2;
       	 temp1=temp2;
       	 temp2=tem;
       	 
       	 System.out.print(" "+tem+" ");
		}
		
		scn.close();

	}

}
