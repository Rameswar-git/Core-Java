package com.rameswar.hackerRank.Interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FraudulentActivityNotifications {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = scan.nextInt();
		int d = scan.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(activityNotifications(arr, d));
		scan.close();
	}

	static int activityNotifications(int[] expenditure, int d) {
		int notificationCount = 0;

		int[] data = new int[201];
		for (int i = 0; i < d; i++) {
			data[expenditure[i]]++;
		}

		for (int i = d; i < expenditure.length; i++) {

			double median = getMedian(d, data);

			if (expenditure[i] >= 2 * median) {
				notificationCount++;

			}

			data[expenditure[i]]++;
			data[expenditure[i - d]]--;

		}

		return notificationCount;

	}

	private static double getMedian(int d, int[] data) {
		double median = 0;
		if (d % 2 == 0) {
			Integer m1 = null;
			Integer m2 = null;
			int count = 0;
			for (int j = 0; j < data.length; j++) {
				count += data[j];
				if (m1 == null && count >= d / 2) {
					m1 = j;
				}
				if (m2 == null && count >= d / 2 + 1) {
					m2 = j;
					break;
				}
			}
			median = (m1 + m2) / 2.0;
		} else {
			int count = 0;
			for (int j = 0; j < data.length; j++) {
				count += data[j];
				if (count > d / 2) {
					median = j;
					break;
				}
			}
		}
		return median;
	}

}
