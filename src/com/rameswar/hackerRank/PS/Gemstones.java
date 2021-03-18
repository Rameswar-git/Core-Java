package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gemstones {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		inpReader.nextLine();
		int[] counts = new int[26];
		int[] temp = null;
		for (int i = 0; i < n; i++) {
			temp = new int[26];
			String s = inpReader.nextLine();
			for (int j = 0; j < s.length(); j++) {
				temp[s.charAt(j) - 97] += 1;
				if (temp[s.charAt(j) - 97] == 1) {
					counts[s.charAt(j) - 97]++;
				}
			}
			temp = null;
		}
		int sum = 0;
		for (int i = 0; i < counts.length; i++) {
			if(counts[i] == n) {
				sum++;
			}
		}
		counts = null;
		System.out.println(sum);	
	}

}
