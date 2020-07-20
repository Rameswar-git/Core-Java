package com.rameswar.hackerRank.PS;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GameofThronesI {

//	public static void main(String[] args) throws Exception {
//		Scanner inpReadre = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
//		String str = inpReadre.nextLine();
//		Map<Character, Long> counts = str.chars().mapToObj(m -> (char) m)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		List<Long> collect = counts.values().stream().filter(m -> m%2 != 0).collect(Collectors.toList());
//		if (collect.size() > 1 || (collect.size()>0 && collect.get(0) % 2 > 1)) {
//			System.out.println("NO");
//		}else {
//			System.out.println("YES");
//		}
//
//	}
	
	public static void main(String[] args) throws Exception {
		Scanner inpReadre = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		char[] str = inpReadre.nextLine().toCharArray();
		int[] frequencies = new int[26];
		for (int i = 0; i < str.length; i++) {
			frequencies[str[i]]++;
		}
		boolean isOddCntExceed = false;
		String ans = "YES";
		for (int i = 0; i < frequencies.length; i++) {
			if (frequencies[i] % 2 != 0) {
				if (isOddCntExceed) {
					ans = "NO";
					break;
				} else {
					isOddCntExceed = true;
				}
			}
		}
		System.out.println(ans);
		inpReadre.close();
	}

}
