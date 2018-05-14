package com.javarevisited.blogspot.in;

import java.util.Arrays;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		String[] names = { "John", "Jammy", "Luke" };
        System.out.println(" Before "+Arrays.toString(names));
		reverse(names);
		 System.out.println(" Before "+Arrays.toString(names));

	}

	private static void reverse(String[] names) {

		if (names == null || names. length < 2) {
             return;
		}

		for (int i = 0; i < names.length / 2; i++) {
			
			String temp=names[i];
			
			names[i]=names[names.length-1-i];
			
			names[names.length-1-i]=temp;

		}

	}

}
