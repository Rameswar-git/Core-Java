package com.ramgeeks.Topics.Arrays;

import java.util.ArrayList;

public class RearrangeEvenOdd {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 1 };
		System.out.println(new RearrangeEvenOdd().assign(a, a.length));
		;
	}

	ArrayList<Integer> assign(int a[], int n) {
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {	
				if (a[i - 1] > a[i]) {
					int temp = a[i - 1];
					a[i - 1] = a[i];
					a[i] = temp;
				}
			} else {
				if (a[i - 1] > a[i]) {
					int temp = a[i - 1];
					a[i - 1] = a[i];
					a[i] = temp;
				}
			}
		}

		ArrayList<Integer> ins = new ArrayList<>(a.length);
		for (int i = 0; i < a.length; i++) {
			ins.add(a[i]);
			
		}

		return ins;
		// Complete the function
	}

}
