package com.fas.Tharading.synchronizetests;

public class Table {
	
	public synchronized void PrintTable(int n){
		System.out.println("*********Multiplication Table for "+n+" is********");
		for(int i=1;i<=10;i++){			
			System.out.print("\t"+n+"*"+i+"===>"+(n*i)+"  ");
		}
		System.out.println();
	}

}
