package com.liange.chapter5;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("All the leap years from 101 to 2100:");
		int count=0;
		for (int i = 101; i < 2100; i++) {
			
			if((i % 4 == 0 && i % 100 !=0) || i % 400 ==0 ){
				count++;
				System.out.print(i+(count % 10 == 0 ? "\n":" "));
			}
			
		}
		System.out.println();
	}

}
