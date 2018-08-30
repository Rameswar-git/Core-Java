package CompleteInterview.Algorithams;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] nos = { 9, 3, 5, 8, 2, 6 };

		for (int i = 0; i < nos.length; i++) {
			for (int j = 0; j < nos.length - 1; j++) {
				if (nos[j + 1] < nos[j]) {
					int temp = nos[j + 1];
					nos[j + 1] = nos[j];
					nos[j] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(nos));

	}

}
