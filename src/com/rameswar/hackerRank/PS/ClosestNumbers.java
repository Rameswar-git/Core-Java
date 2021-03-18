package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = inpReader.nextInt();
		}
		Arrays.sort(arr);
		Pairs[] prs = new Pairs[n - 1];
		prs[0] = new Pairs(arr[1] - arr[0], 1, 0);
		for (int i = 1; i < n - 1; i++) {
			prs[i] = new Pairs(arr[i + 1] - arr[i], i + 1, i);
		}
		Arrays.sort(prs);
		int smallerDiff = prs[0].diff;
		List<Integer> ins = new LinkedList<>();
		ins.add(prs[0].smallerIdx);
		ins.add(prs[0].greaterIdx);
		for (int i = 1; i < prs.length; i++) {
			if (prs[i].diff == smallerDiff) {
				ins.add(prs[i].smallerIdx);
				ins.add(prs[i].greaterIdx);
			} else {
				break;
			}

		}
		if (ins.size() > 0) {
			Integer[] insarr = new Integer[ins.size()];
			StringBuilder bld = new StringBuilder();
			ins.toArray(insarr);
			Arrays.sort(insarr);
			for (int i = 0; i < insarr.length; i++) {
				bld.append(arr[insarr[i]] + " ");
			}
			System.out.println(bld.toString().trim());
		} else {
			System.out.println(arr[prs[0].smallerIdx] + " " + arr[prs[0].greaterIdx]);
		}

	}

	public static class Pairs implements Comparable<Pairs> {
		public int diff;
		public int greaterIdx;
		public int smallerIdx;

		public Pairs(int diff, int greaterIdx, int smallerIdx) {
			this.diff = diff;
			this.greaterIdx = greaterIdx;
			this.smallerIdx = smallerIdx;
		}

		@Override
		public int compareTo(Pairs o) {
			return this.diff - o.diff;
		}

		@Override
		public String toString() {
			return "Pairs [diff=" + diff + ", greaterIdx=" + greaterIdx + ", smallerIdx=" + smallerIdx + "]";
		}

	}

}
