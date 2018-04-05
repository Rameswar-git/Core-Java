package com.tst.program2;

public class ThreadTwice extends Thread {
	
	public void run(){
		for(int i=0;i<=5;i++){
			try {
				Thread.sleep(5000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadTwice t1=new ThreadTwice();
		ThreadTwice t2=new ThreadTwice();
		
		t1.start();
		t2.start();
		
	}

}
