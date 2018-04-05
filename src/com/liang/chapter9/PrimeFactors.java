package com.liang.chapter9;

import java.util.Stack;

public class PrimeFactors {
	Stack<Integer> st;
	int no;

	PrimeFactors(Stack<Integer> sta, int no2) {
		this.st = sta;
		this.no = no2;
	}

	public Stack<Integer> factors() {
		for (int i = 2; i < 10; i++) {
			while(no % i == 0){
				this.st.push(i);
				no/=i;
			}
		}
		return st;
	}

}
