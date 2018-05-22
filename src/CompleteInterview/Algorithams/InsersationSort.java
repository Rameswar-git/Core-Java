package CompleteInterview.Algorithams;

import java.util.Arrays;

public class InsersationSort {

	public static void main(String[] args) {

		int[] ins = { 5, 8, 1, 3, 9, 6 };
		int n = ins.length;

		int k = 1;
		while (k < n) {
			int m = k;
			while (m > 0) {

				if (ins[m] < ins[m - 1]) {
					int temp = ins[m - 1];
					ins[m - 1] = ins[m];
					ins[m] = temp;
				}

				m--;
			}

			k++;
		}

		System.out.println(Arrays.toString(ins));

	}

}
