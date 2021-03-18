package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LilysHomework {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = scan.nextInt();
		int[] inputArr = new int[n];
		int[] inputArr2 = new int[n];
		Map<Integer,Integer> valindex1 = new HashMap<>();
		Map<Integer,Integer> valindex2 = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int element  = scan.nextInt();
			inputArr[i] = element;
			inputArr2[i] = element;
			valindex1.put(element, i);
			valindex2.put(element, i);
		}
		int[] sortedArr = Arrays.stream(inputArr).sorted().toArray();
		int swapcount = 0;
		int revswapcount = 0;
		for (int i = 0; i < n ; i++) {
			if(sortedArr[i] != inputArr[i]) {
				int temp = inputArr[i];
				inputArr[i] = inputArr[valindex1.get(sortedArr[i])];
				inputArr[valindex1.get(sortedArr[i])] = temp;
				valindex1.put(temp, valindex1.get(sortedArr[i]));
//				valindex1.put(sortedArr[i],i); // this one required because we will not use it any more
				//adding the above line will fail some test cases
				swapcount++;
			}
			
			if(inputArr2[i] != sortedArr[n-i-1]) {
				int temp = inputArr2[i];
				inputArr2[i] = inputArr2[valindex2.get(sortedArr[n-i-1])];
				inputArr2[valindex2.get(sortedArr[n-i-1])] = temp;
				valindex2.put(temp, valindex2.get(sortedArr[n-i-1]));
//				valindex1.put(sortedArr[n-i-1],i);// this one required because we will not use it any more
				//adding the above line will fail some test cases
				revswapcount++;
			}
		}
		System.out.println(revswapcount<swapcount?revswapcount:swapcount);
	}

}
