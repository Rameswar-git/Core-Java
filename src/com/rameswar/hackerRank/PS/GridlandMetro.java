package com.rameswar.hackerRank.PS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


/*
 * there is an difference between statement 
 * 1 . long result = (long) r * c; 
 * and
 * 2 . long result = (long) (r * c);
 * the second statement will give result an negative value but the
 * first statement gives correct result
 * so while type casting brackets should not be used
 */

public class GridlandMetro {
	
	static double eps = (double) 1e-6;
	static int mod = (int) 1e9 + 7;

	public static void main(String args[]) throws FileNotFoundException {
		InputReader in = new InputReader(new FileInputStream(new File("C:\\Users\\Vicky\\Desktop\\input00.txt")));
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		// ----------My Code----------
		long n = in.nextInt();
		long m = in.nextInt();
		int k = in.nextInt();
		ArrayList<Pair> arr = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			int r = in.nextInt();
			int c1 = in.nextInt();
			int c2 = in.nextInt();
			arr.add(new Pair(c1, c2, r));
		}
		Collections.sort(arr);
		long add = 0;
		int cur = -1;
		long start = -1, end = -1;
		for (Pair p : arr) {
			if (p.row == cur) {
				if (p.y < end) {
					continue;
				} else if (p.x > end) {
					add += end - start + 1;
					start = p.x;
					end = p.y;
				} else {
					end = Math.max(end, p.y);
				}
			} else {
				if (end != -1)
					add += end - start + 1;
				cur = p.row;
				start = p.x;
				end = p.y;
			}
		}
		if (end != -1)
			add += end - start + 1;
		System.out.println((n * m) - add);
		out.close();
		// ---------------The End------------------

	}

	static class Pair implements Comparable<Pair> {
		long x;
		long y;
		int row;

		Pair(long xx, long yy, int r) {
			x = xx;
			y = yy;
			row = r;
		}

		@Override
		public int compareTo(Pair o) {
			if (Long.compare(this.row, o.row) != 0) {
				return Long.compare(this.row, o.row);
			} else {
				if (Long.compare(this.x, o.x) != 0)
					return Long.compare(this.x, o.x);
				else
					return Long.compare(this.y, o.y);
			}
		}
	}

	public static void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream inputstream) {
			reader = new BufferedReader(new InputStreamReader(inputstream));
			tokenizer = null;
		}

		public String nextLine() {
			String fullLine = null;
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					fullLine = reader.readLine();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				return fullLine;
			}
			return fullLine;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
//	public static void main(String[] args) throws FileNotFoundException {
//		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
//        int r = inpReader.nextInt();
//        int c = inpReader.nextInt();
//        int k = inpReader.nextInt();
//        Map<Integer,Stack<int[]>> counts = new HashMap<>();
//        for (int i = 0; i < k; i++) {
//            int r1 = inpReader.nextInt();
//            int c1 = inpReader.nextInt();
//            int c2 = inpReader.nextInt();
//            if(counts.containsKey(r1)) {
//            	int[] temp = counts.get(r1).peek();
//                if(temp[1] >= c1) {
//                	temp[1]  = Math.max(c2, temp[1]);
//                }else {
//                	 counts.get(r1).push(new int[] {c1,c2});
//                }
//               
//            }else {
//            	Stack<int[]> s = new Stack<>();
//            	s.push(new int[] {c1,c2});
//            	counts.put(r1, s);
//            }
//        }
//        long result = (long) r * c;
//        for (Stack<int[]> tracks : counts.values()) {
//        	for (int[] in : tracks) {
//        		result =result - (in[1]-in[0]+1);
//			}
//        }
//        System.out.println(result>0?result:0);
//    }
}
