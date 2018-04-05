package com.liang.chapter9;

public class Stock {
	private String Symbel;
	private String name;
	public double PreviousPrice;
	public double currentprice;

	public Stock(String symbel,String name) {
		this.Symbel=symbel;
		this.name=name;
	}
	
	public double getChangePercentage() {
		return(((currentprice-PreviousPrice)/PreviousPrice)*100);
	}

}
