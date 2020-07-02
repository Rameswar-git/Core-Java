package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;


public class TheFullCountingSort {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = Integer.parseInt(scanner.nextLine());
		StringBuilder STDOUT = new StringBuilder("");
		int[] frequencyes = new int[100];
		Map<Integer,Queue<String>> inputs = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String[] value = scanner.nextLine().split("\\s+");
			int num = Integer.parseInt(value[0]);
			String s  = value[1];
			if(i< n/2) s = "-";
			if(!inputs.containsKey(num)) {
				inputs.put(num, new LinkedList());
			}
			inputs.get(num).add(s);
			frequencyes[num] = frequencyes[num]+1;
		}
		for (int i = 0; i < frequencyes.length; i++) {
			for (int j = 0; j < frequencyes[i]; j++) {
				STDOUT.append(inputs.get(i).poll()+" ");
			}
		}
		System.out.println(STDOUT);
	}

}
