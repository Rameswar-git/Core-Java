package com.rameswar.hackerRank.Interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NewYearChaos {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testCases = inpReader.nextInt();
		for (int t = 0; t < testCases; t++) {
			int n = inpReader.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = inpReader.nextInt();
			}
			minimumBribes(arr, n);
		}

	}

//	static void minimumBribes(int[] q) {
//		int n = q.length;
//		List<Integer> ints = new LinkedList<Integer>();
//		for (int i = 1; i <= n; i++) {
//			ints.add(i);
//		}
//		int res = 0;
//		for (int i = 0; i < q.length; i++) {
//			if (q[i] == ints.get(ints.size()-ints.size() )) {
//				ints.remove(ints.size()-ints.size());
//			} else if (q[i] == ints.get(ints.size() - ints.size()  + 1)) {
//				res += 1;
//				ints.remove(ints.size() - ints.size()  + 1);
//			} else if (q[i] == ints.get(ints.size() - ints.size()  + 2)) {
//				res += 2;
//				ints.remove(ints.size() - ints.size()  + 2);
//			} else {
//				System.out.println("Too chaotic");
//				return;
//			}
//		}
//		System.out.println(res);
//	}

	static void minimumBribes(int[] q, int n) {
		 boolean finished = false;
		int[] frequescies = new int[n + 1];
		int count = 0;
		 while (!finished) {
			 finished = true;
				for (int i = 0; i < q.length - 1; i++) {
					if (q[i] > q[i + 1]) {
						frequescies[q[i]]++;
						if (frequescies[q[i]] > 2) {
							System.out.println("Too chaotic");
							return;
						}
						count++;
						int temp = q[i];
						q[i] = q[i + 1];
						q[i + 1] = temp;
						finished= false;
					}
				}
		 }

		System.out.println(count);
	}

}
