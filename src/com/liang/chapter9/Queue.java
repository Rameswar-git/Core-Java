package com.liang.chapter9;

public class Queue {
	private int[] elemnts;

	private int size;

	public Queue() {
		this.elemnts = new int[8];
	}

	public int[] getElemnts() {
		return elemnts;
	}

	public void enqueue(int i) {
		if (size >= elemnts.length) {
			int[] temp = new int[elemnts.length * 2];
			System.arraycopy(elemnts, 0, temp, 0, elemnts.length);
			elemnts = temp;
		}
		elemnts[size++] = i;
	}

	public int deque() {
		int v=elemnts[0];
		int[] temp=new int[elemnts.length-1];
		System.arraycopy(elemnts, 1, temp, 0, size);
		elemnts=temp;
		size--;
		return v;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		return elemnts.length;
	}

}
