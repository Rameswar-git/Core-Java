package com.fas.Tharading.synchronizetests;

public class SynchronizeTest {

	public static void main(String[] args) {
		Table multable=new Table();
		TableThread tableThread=new TableThread(multable,6);
		TableThread tableThread2=new TableThread(multable,5);

		tableThread.start();
		tableThread2.start();
	}

}
