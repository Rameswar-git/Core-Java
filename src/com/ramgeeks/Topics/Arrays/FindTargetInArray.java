package com.ramgeeks.Topics.Arrays;

public class FindTargetInArray {

	public static void main(String[] args) {

		int arr[] = { 11, 15, 6, 8, 9, 10 };
		int sum = 17;
		int n = arr.length;
		int index = 0;
		for (index = 0; index < arr.length; index++) {
			if (arr[index] > arr[index + 1]) {
				break;
			}
		}

		int a = index + 1;
		int b = index;

		while (a != b) {
			if (arr[a] + arr[b] == sum)
				break;
			if (arr[a] + arr[b] < sum)
				a = (a + 1) % arr.length;
			else
				b = (n + b - 1) % n;
		}

//		outer: for (int i = index + 1; i < arr.length; i++) {
//			if (arr[i % (arr.length - 1)] < sum) {
//				int required = sum - arr[i % (arr.length - 1)];
//				a = arr[i % (arr.length - 1)];
//				if (required > arr[i % (arr.length - 1)]) {
//					for (int j = i + 1; j < arr.length && arr[j % (arr.length - 1)] < sum
//							&& arr[j % (arr.length - 1)] <= required; j++) {
//						if (arr[j % (arr.length - 1)] == required) {
//							b = required;
//							break outer;
//						}
//					}
//				} else {
//					break;
//				}
//			} else {
//				break;
//			}
//		}

		System.out.printf("The value is %d , %d ", a, b);

	}

}
