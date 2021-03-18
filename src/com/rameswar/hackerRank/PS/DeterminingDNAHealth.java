package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeterminingDNAHealth {
	TrieNode root = new TrieNode();

	class TrieNode {
		private TrieNode[] children;
		private List<Integer> indexes;
		private List<Long> health;

		TrieNode() {
			this.children = new TrieNode[26];
			this.indexes = new ArrayList<Integer>();
			this.health = new ArrayList<Long>();
		}
	}

	public void add(String word, int index, long health) {
		TrieNode current = root;
		long previousSum = 0l;
		for (int i = 0; i < word.length(); i++) {
			TrieNode node = current.children[word.charAt(i) - 'a'];
			if (node == null) {
				node = new TrieNode();
				current.children[word.charAt(i) - 'a'] = node;
			}
			current = node;
		}
		if (!current.indexes.isEmpty()) {
			previousSum = current.health.get(current.indexes.size() - 1);
		}
		current.indexes.add(index);
		current.health.add(health + previousSum);

	}

	private int findIndex(List<Integer> indexes, int start, int end, int index) {

		int middle = start + (end - start) / 2;
		if (indexes.get(middle).intValue() == index) {
			return middle;
		} else if (indexes.get(start).intValue() == index) {
			return start;
		} else if (indexes.get(end).intValue() == index) {
			return end;
		} else if (indexes.get(middle).intValue() > index) {
			end = middle;
		} else {
			start = middle;
		}
		if (end - start <= 1) {
			if (indexes.get(end).intValue() < index) {
				return end;
			}
			return start;
		}
		return findIndex(indexes, start, end, index);

	}

	private long getHealth(TrieNode node, int first, int last) {
		long health = 0l;
		int indexesLength = node.indexes.size();
		int startIndex, endIndex;
		if (indexesLength == 0) {
			return 0l;
		}
		startIndex = findIndex(node.indexes, 0, indexesLength - 1, first - 1);
		endIndex = findIndex(node.indexes, 0, indexesLength - 1, last);
		if (node.indexes.get(endIndex).intValue() <= last) {
			health += node.health.get(endIndex);
		}
		if (node.indexes.get(startIndex).intValue() < first) {
			health -= node.health.get(startIndex);
		}
		return health;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));

		int n = in.nextInt();
		String[] genes = new String[n];
		for (int genes_i = 0; genes_i < n; genes_i++) {
			genes[genes_i] = in.next();
		}
		long[] health = new long[n];
		for (int health_i = 0; health_i < n; health_i++) {
			health[health_i] = in.nextInt();
		}

		DeterminingDNAHealth suffixTrie = new DeterminingDNAHealth();
		for (int i = 0; i < genes.length; i++) {
			suffixTrie.add(genes[i], i, health[i]);
		}
		int s = in.nextInt();
		long sum = 0l;
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;

		for (int genes_i = 0; genes_i < s; genes_i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			String word = in.next();
			int wordLen = word.length();
			for (int i = 0; i < wordLen; i++) {
				int charCounter = i;
				TrieNode node = suffixTrie.root;
				do {
					node = node.children[word.charAt(charCounter++) - 'a'];
					if (node == null) {
						break;
					}
					sum += suffixTrie.getHealth(node, from, to);
				} while (charCounter < wordLen);
			}
			max = Math.max(max, sum);
			min = Math.min(min, sum);
			sum = 0l;
		}
		System.out.println(min + " " + max);
	}
}
