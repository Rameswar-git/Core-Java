package com.practice;

import java.util.Scanner;

public class FibiniceeSeris {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:-");
		int number = sc.nextInt();
		int a = 0, temp = 1, fib = 0, temp2 = 0;
		for (int i = 0; i <= number; i++) {
			if (i == 0 || i == 1) {
				fib = a + temp;
				fib = temp;
			} else if (i > 1) {
				temp2 = fib;
				fib = i + temp2;
			}
			System.out.println(fib);
		}
		sc.close();
	}

}
