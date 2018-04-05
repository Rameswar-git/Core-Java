package com.tst.program2;

public class Runner extends Thread{
  
	boolean bExit = false;
	public void exit(boolean bExit) {
		this.bExit = bExit;
	}
	@Override
	public void run() {
		while (!bExit) {
			System.out.println("Thread is running");
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {

			}
		}
	}
	
   public static void main(String[] args) throws InterruptedException {
	   Runner run=new Runner();
	   run.start();
	   Thread.sleep(5000);
	   run.bExit=true;
   }
	
	
}
