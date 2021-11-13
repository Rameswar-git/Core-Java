package com.ramgeeks.Topics.Arrays;

import java.util.Stack;

public class TheCelebrityProblem {

	public static void main(String[] args) {

	}
	
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> stk = new Stack<>();
    	for (int i = 0; i < M.length; i++) {
			stk.push(i);
		}
    	while(stk.size() > 1) {
    		Integer i = stk.pop();
    		Integer j = stk.pop();
    		if(M[i][j] == 1) {
    			stk.push(j);
    		}else {
    			stk.push(i);
    		}
    	}
    	
    	int pot = stk.pop();
    	for (int i = 0; i < M.length; i++) {
			if(i != pot) {
				if(M[i][pot] == 0 || M[pot][i] == 1)
					return -1;
			}
		}
    	return pot;
    }

}
