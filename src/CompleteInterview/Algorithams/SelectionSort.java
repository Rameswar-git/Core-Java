package CompleteInterview.Algorithams;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] ins = { 9, 14, 3, 2, 43, 11, 58, 22 };

		for (int i = 0; i < ins.length - 1; i++) {
			int min = ins[i];
			int minindex = i;
			for (int j2 = i + 1; j2 < ins.length; j2++) {
				if (ins[j2] < min) {
					min = ins[j2];
					minindex = j2;
				}
			}
			if (ins[i] > ins[minindex]) {
				int temp = ins[i];
				ins[i] = ins[minindex];
				ins[minindex] = temp;
			}
		}

		System.out.println(Arrays.toString(ins));

	}

}
