package com.rameswar.hackerRank.Interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MarkandToys {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		int[] toys = new int[n];
		int price = inpReader.nextInt();
		for (int i = 0; i < n; i++) {
			toys[i] = inpReader.nextInt();
		}
		int toycount = 0;
		Arrays.sort(toys);
		for (int i = 0; i < toys.length; i++) {
			if (price > 0) {
				toycount++;
				price -= toys[i];
			}else {
				break;
			}
		}
		System.out.println(toycount);
	}

}
