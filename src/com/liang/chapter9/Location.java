package com.liang.chapter9;

public class Location {
	private static double max;
	private static String maxlocation;

	public static Location locateLargest(double[][] a) {
		max=a[0][0];
		maxlocation="0,0";
    for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			if(a[i][j]>max){
				max=a[i][j];
				maxlocation=String.valueOf(i)+","+String.valueOf(j);
			}
		}
	}
		return new Location();
	}

	@Override
	public String toString() {
		return "Location [max=" + max + ", maxlocation=" + maxlocation + "]";
	}

}
