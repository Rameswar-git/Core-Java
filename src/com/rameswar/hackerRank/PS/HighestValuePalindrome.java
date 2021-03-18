package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HighestValuePalindrome {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = reader.nextInt();
		int k = reader.nextInt();
		char[] c = reader.next().toCharArray();
		boolean[] ch = new boolean[n];
		for (int i = 0; i < n / 2; i++) {
			if (c[i] != c[n - i - 1]) {
				c[i] = c[n - i - 1] = (char) Math.max(c[i], c[n - i - 1]);
				ch[i] = true;
				k--;
			}
		}
		if(k<0) {
			System.out.println(-1);
			return;
		}
		for (int i = 0; i < n/2; i++) {
			if(c[i]!= '9') {
				if(ch[i] && k>0) {
					c[i] = c[n-i-1] = '9';
					k--;
				}
				if(!ch[i] && k>1) {
					c[i] = c[n-i-1] = '9';
					k-=2;
				}
			}
		}
		if(n%2 == 1 && k>1) {
			c[n/2] = '9';
		}
		System.out.println(new String(c));
		reader.close();
	}

}
