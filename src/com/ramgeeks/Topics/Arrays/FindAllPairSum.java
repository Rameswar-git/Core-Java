package com.ramgeeks.Topics.Arrays;

public class FindAllPairSum {
	static int pairsInSortedRotated(int arr[], int n, int x) {

		int i;
		for (i = 0; i < n - 1; i++)
			if (arr[i] > arr[i + 1])
				break;

		int l = (i + 1) % n;

		int r = i;

		int cnt = 0;

		while (l != r) {

			if (arr[l] + arr[r] == x) {
				cnt++;

				if (l == (r - 1 + n) % n) {
					return cnt;
				}

				l = (l + 1) % n;
				r = (r - 1 + n) % n;
			}

			else if (arr[l] + arr[r] < x)
				l = (l + 1) % n;

			else
				r = (n + r - 1) % n;
		}

		return cnt;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 15, 6, 7, 9, 10 };
		int sum = 16;
		int n = arr.length;

		System.out.println(pairsInSortedRotated(arr, n, sum));
	}
}
