package com.tst.program2;

public class Runner2 extends Thread{
	private boolean bexit=false;
	
	public void setexit(boolean exit){
		this.bexit=exit;
	}

	public void run(){
		while(!bexit){
			System.out.println("Thread Is runnig");
			
		}
	}	
	public static void main(String[] args) throws InterruptedException {
		Runner2 run=new Runner2();
		run.start();
		Thread.sleep(5000);
		run.bexit=true;
	}
}
