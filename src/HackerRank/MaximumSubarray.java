package HackerRank;

import java.util.Arrays;

public class MaximumSubarray {
	public static void main(String[] args) {
		long[] inarr = { 3, 3, 9, 9, 5 };
//		long[] inarr = { 1 ,5 ,9 };
		System.out.println(maximumSum(inarr, 7));
	}

	static long maximumSum(long[] a, long m) {
		Arrays.sort(a);
		long max = 0;
		long[] array = Arrays.stream(a).filter(p -> p <= m - 1).sorted().toArray();
		for (long i = m - 1; i >= 0; i--) {
			long dis = Search(array, i);
			if (i == dis) {
				if (max < i) {
					max = i;
				}
			}
		}
		long[] array2 = Arrays.stream(a).filter(p -> p >= m + 1).sorted().toArray();
		for (int i = 0; i < array2.length; i++) {
			long l = array2[i];
			long val = l % m;
			if (max < val) {
				max = val;
			}
		}
		return max;
	}

	private static long Search(long[] array, long l) {

		int index = Arrays.binarySearch(array, l);
		if (index >= 0) {
			return l;
		}
		long search = l;
		long sum = 0;
		int i = 0;
		for (; i < array.length && sum <= search; i++) {
			sum += array[i];
			if (sum == search) {
				return l;
			}
		}
		for (int j = 0; j < array.length; j++) {
			long x = array[j];
			long remain = search - x;
			int index2 = Arrays.binarySearch(array, remain);
			if (index2 >= 0) {
				return l;
			}
		}

		return 0;
	}
}