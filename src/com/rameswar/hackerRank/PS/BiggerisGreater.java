package com.rameswar.hackerRank.PS;

import java.util.Arrays;
import java.util.Scanner;

public class BiggerisGreater {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		while (testCases-- > 0) {
			System.out.println(biggerIsGreater(scan.next()));
		}
		scan.close();
	}

	public static String biggerIsGreater(String w) {
		char[] letters = w.toCharArray();
		for (int i = letters.length - 2; i >= 0; i--) {
			if (letters[i] < letters[i + 1]) {
				char greaterChar = letters[i + 1];
				int pos = i + 1;
				for (int j = i+1; j < letters.length; j++) {
					if(letters[j] < greaterChar && letters[j] > letters[i]) {
						greaterChar = letters[j];
						pos = j;
					}
				}
					char temp =letters[i];
					letters[i] = greaterChar;
					letters[pos] = temp;
					Arrays.sort(letters,i+1,letters.length);
					return new String(letters);
				}
			}
		   return "no answer";
		}

}
