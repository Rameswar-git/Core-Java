package com.rameswar.hackerRank.Interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CountTriplets {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		long r = inpReader.nextLong();
		List<Long> values = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			values.add(inpReader.nextLong());
		}
		System.out.println(countTriplets(values,r));
	}

	private static long countTriplets(List<Long> values, long r) {
		HashMap<Long,Long> current = new HashMap<>();
		HashMap<Long, Long> nextels = new HashMap<>();
		long count  = 0;
		for (Long val : values) {
			long next = val * r;
			count+=nextels.getOrDefault(val, 0l);
			if(current.containsKey(val))
				add(nextels,next,current.get(val));
			add(current,next,1);
		}

		return count;
	}

	private static void add(HashMap<Long, Long> map, long key, long val) {
		map.put(key, map.getOrDefault(key, 0l)+val);
	}

}
