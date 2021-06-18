package com.ramgeeks.Topics.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumIndex {

	public static void main(String[] args) {
////	int[] A = {1, 10};
//		int A[] = {65 ,6 ,74 ,94 ,56 ,89 ,9 ,63 ,75 ,25 ,34 ,68 ,93 ,48 ,16};
		int A[] =	{34, 8, 10, 3, 2, 80, 30, 33, 1};
		System.out.println(maxIndexDiff(A,A.length));
	}
//	
	
	
    static int maxIndexDiff(int arr[], int n) { 
    	HashMap<Integer,ArrayList<Integer>> idxs = new HashMap<>();
    	for (int i = 0; i < arr.length; i++) {
			if(idxs.containsKey(arr[i])) {
				idxs.get(arr[i]).add(i);
			}else {
				idxs.put(arr[i], new ArrayList<>());
				idxs.get(arr[i]).add(i);
			}
		}
		int maxDiff = Integer.MIN_VALUE , temp = n;
		Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
			if(temp > idxs.get(arr[j]).get(0)) {
				temp = idxs.get(arr[j]).get(0);
			}
			maxDiff = Math.max(maxDiff,idxs.get(arr[j]).get(idxs.get(arr[j]).size() -1) -temp );
		}
		return maxDiff;
    }
  
    

}
