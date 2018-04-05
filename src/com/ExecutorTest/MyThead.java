package com.ExecutorTest;

public class MyThead extends Thread {

	@Override
	public void run() {
  for (int i = 0; i < 5; i++) {
	  System.out.println(Thread.currentThread().getName());
	  System.out.println("~~~~~~~~~~"+i+"~~~~~~~~~~");
  }
	}
	
	

}
