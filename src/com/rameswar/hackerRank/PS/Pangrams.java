package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		String str = inpReader.nextLine().toLowerCase();
		char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		for (int i = 0; i < alphabets.length; i++) {
			if(Arrays.binarySearch(arr, alphabets[i]) < 0) {
				System.out.println("not pangram");
				inpReader.close();
				return;
			}
		}
		System.out.println("pangram");
		inpReader.close();
	}

}
