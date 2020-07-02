package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AlmostSorted {

	private static ArrayList<Integer> lst;
	private static boolean inodr(int p) {
		return lst.get(p-1) < lst.get(p) && lst.get(p) < lst.get(p+1);
	}
	private static void swap(int p, int q) {
		int a = lst.get(p);
		lst.set(p, lst.get(q));
		lst.set(q, a);
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = sc.nextInt();
		lst = new ArrayList<>();
		lst.add(-1);
		ArrayList<Integer> dor = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			lst.add(a);
			if (lst.get(i - 1) > lst.get(i)) {
				dor.add(i-1);
			}
		}
		lst.add(100000000);
		if (dor.size() == 0) {
			System.out.println("yes");
			return;
		}
//		if (dor.size() < 5) {
			for(int k=dor.get(0) + 1; k <= n; k++) {
				swap(dor.get(0), k);
				boolean flag = inodr(k);
				for(int p : dor) {
					if(!inodr(p)) flag = false;
				}
				if(flag) {
					System.out.println("yes");
					System.out.println("swap "+dor.get(0)+" "+k);
					return;
				}
				swap(dor.get(0), k);
			}
//		}
		if(dor.get(0) + dor.size()  == dor.get(dor.size() - 1) + 1) {
			int st = dor.get(0);
			int ed = dor.get(dor.size() - 1) + 1;
			if(lst.get(st - 1) < lst.get(ed) && lst.get(st) < lst.get(ed + 1)) {
				System.out.println("yes");
				System.out.println("reverse "+st+" "+ed);
				return;
			}
		}
		System.out.println("no");
	}
}
