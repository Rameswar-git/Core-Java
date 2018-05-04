package com.liang.chapter18.Ex_18_4;

public class SumSeris {

	public static void main(String[] args) {
		System.out.printf("%2d.2f",CalculateSum(5));
//       System.out.printf(" The Sum Of 2 Series Up to 5 is %2d.2f ",CalculateSum(5));
	}
	
	public static double CalculateSum(double d1) {
		double init=1/d1;
		if(d1 < 2)
			return 1;
		else
		  return init+=CalculateSum(d1-1);
			
//		return no=(1no(CalculateSum(1/(d1-1)));
		
	}

}
