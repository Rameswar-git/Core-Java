package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

public class RearrangeNumbers {

	public static void main(String[] args) {
		int[] arr = { -12, -11, -13, -5, -6, 7, 5, 3, 6 };
		int[] positive = new int[1];
		int[] negative = new int[1];
		int positivecnt = 0;
		int negativeCnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				if(positivecnt < positive.length) {
					positive[positivecnt++] = arr[i];
				}else {
					positive = Arrays.copyOf(positive, positive.length + 1 );
					positive[positivecnt++] = arr[i];
				}
			}else {
				if(negativeCnt < negative.length) {
					negative[negativeCnt++] = arr[i];
				}else {
					negative = Arrays.copyOf(negative, negative.length + 1);
					negative[negativeCnt++] = arr[i];
				}
			}
		}
		int[] result = new int[negativeCnt + positivecnt];
		int curser = 0;
		while(negativeCnt > 0) {
			result[curser++] = negative[negative.length - negativeCnt ] ;
			negativeCnt--;
		}
		
		while(positivecnt > 0) {
			result[curser++] = positive[positive.length - positivecnt ];
			positivecnt--;
		}
		
		System.out.println(Arrays.toString(result));
	}

}
