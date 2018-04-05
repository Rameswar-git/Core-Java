package com.liang.chapter9;

public class StockTest {

	public static void main(String[] args) {
       Stock stk1=new Stock("ORCL", "Oracle Corporation");
       stk1.PreviousPrice=34.5;
       stk1.currentprice=34.35;
       System.out.printf("Change Percentage %.2f%%\n ",stk1.getChangePercentage());
	}

}
