package com.ExecutorTest;

public class TheardTest {

	public static void main(String[] args) throws InterruptedException {
		MyThead t1=new MyThead();
		MyThead t2=new MyThead();
		MyThead t3=new MyThead();
		t1.setName("Uma");
		t2.setName("rameswar");
		t3.setName("rakesh");
		t1.start();
		t3.start();
		t1.join();
		t3.join();
		t2.start();
		System.out.println("*****Finished*********");
	}

}
