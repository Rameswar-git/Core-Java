package com.ramgeeks.Topics.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class FindMissingInSecondArray {

	public static void main(String[] args) {
		long A[] = { 1, 2, 3, 4, 5, 10 };
		long B[] = { 2, 3, 1, 0, 5 };
		ArrayList<Long> res = new FindMissingInSecondArray().findMissing(A, B, A.length, B.length);
		System.out.println(res);
	}

	ArrayList<Long> findMissing(long A[], long B[], int N, int M) {
	       // Store all elements of
        // second array in a hash table
		ArrayList<Long> result = new ArrayList<>();
        HashSet<Long> s = new HashSet<>();
        for (int i = 0; i < M; i++)
            s.add(B[i]);
         
        // Print all elements of first array
        // that are not present in hash table
        for (int i = 0; i < N; i++) {
            if (!s.contains(A[i]))
            	result.add(A[i]);
        }
        return result;

	}

}
