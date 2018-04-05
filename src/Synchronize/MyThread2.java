package Synchronize;

public class MyThread2 extends Thread{
	
	private MultiplicationTable mt2;
	
	MyThread2(MultiplicationTable m){
		this.mt2=m;
	}
	
	public void run(){
		mt2.table(6);
	}
	
	
	
}
