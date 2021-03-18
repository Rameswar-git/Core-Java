package com.ramgeeks.Topics.Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class SortArrayByFrequency {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testCases = inpReader.nextInt();
		for (int r = 0; r < testCases; r++) {
			int n = inpReader.nextInt();
			Map<Integer, Integer> ins = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int inp = inpReader.nextInt();
				if (ins.containsKey(inp)) {
					ins.put(inp, ins.get(inp) + 1);
				} else {
					ins.put(inp, 1);
				}
			}
			List<Map.Entry<Integer, Integer>> ks = new LinkedList<>(ins.entrySet());

			Collections.sort(ks, new CustomComparator());
			StringBuilder bld = new StringBuilder();
			for (int i = ks.size() - 1; i >= 0; i--) {
				Map.Entry<Integer, Integer> element = ks.get(i);
				for (int j = 0; j < element.getValue(); j++) {
					bld.append(element.getKey()+" ");
				}
			}
			System.out.println(bld.toString().trim());
		}
	}

	public static class CustomComparator implements Comparator<Entry<Integer, Integer>> {

		@Override
		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
			if (o1.getValue().equals(o2.getValue())) {
				return o2.getKey().compareTo(o1.getKey());
			} else {
				return o1.getValue().compareTo(o2.getValue());
			}
		}

	}

}
