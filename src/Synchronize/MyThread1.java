package Synchronize;

public class MyThread1 extends Thread {
	
	MultiplicationTable mt;
	
	MyThread1(MultiplicationTable t){
		this.mt=t;
	}
	
	public void run(){
		mt.table(4);
	}

}
