package com.practice;

import java.util.Scanner;

public class Fibonaciess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int array[] = new int[number];
		for (int i = 0, count = 1; i < array.length; i++) {
			if (i == 0)
				array[i] = count;
			else if (i == 1)
				array[i] = 1;
			else if (i >= 2)
				array[i] = array[i - 1] + array[i - 2];
			System.out.println(array[i]);
		}
		System.out.println("give the index number:-");
		int index = sc.nextInt();
		System.out.println("The number at the index " + index + " is "
				+ array[index]);
		
		sc.close();
	}


	

}
