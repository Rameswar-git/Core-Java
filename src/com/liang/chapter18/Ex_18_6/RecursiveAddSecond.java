package com.liang.chapter18.Ex_18_6;

public class RecursiveAddSecond {

	public static void main(String[] args) {
          System.out.printf("Addition is %.2f\n",recAdd(10.0));
	}

	private static double recAdd(Double i) {

		double no=i/(i+1);
		
		if(i == 0)
			return 0;
		else
		    return no+=recAdd(i-1);

	}

}
