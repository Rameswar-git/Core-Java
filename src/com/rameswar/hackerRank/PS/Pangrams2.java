package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pangrams2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		char[] arr = inpReader.nextLine().toLowerCase().toCharArray();
		boolean[] finder = new boolean[26];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				finder[arr[i] - 'a'] = true;
			}
		}
		for (int i = 0; i < finder.length; i++) {
			if (!finder[i]) {
				System.out.println("not pangram");
				inpReader.close();
				return;
			}
		}
		System.out.println("pangram");
		inpReader.close();
	}

}
