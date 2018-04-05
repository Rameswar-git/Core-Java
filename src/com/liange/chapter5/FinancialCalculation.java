package com.liange.chapter5;

public class FinancialCalculation {
	public static void main(String[] args) {
		int tutionfee=10000;
		int post10year_4years=0;
		for (int year=1 ; year<=14 ; year++) {
			
			tutionfee+=(tutionfee*0.05);
			
			if (year == 1) {
				System.out.println("Tution Fee In One Year "+tutionfee);
			}
			
			if (year == 5) {
				System.out.println("After 5 Years Tution Fee Become "+tutionfee);
			}
			
			if (year == 10) {
				System.out.println("After 10 Years Tution Fee Become "+tutionfee);
			}
			
			if (year > 10) {
				post10year_4years+=tutionfee;
			}
			
		}
		
		System.out.println("After 14 Years The Tution Fees Will Become "+post10year_4years);
	}

}
