package com.fas.Tharading.synchronizetests;

public class TableThread extends Thread{
	Table tab;
	int no;
	
	public TableThread(Table tab,int number){
		this.tab=tab;
		this.no=number;
	}
	
	@Override
	public void run(){
		tab.PrintTable(no);
	}

}
