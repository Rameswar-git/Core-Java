package com.singleton.test;

public class Threadisalive extends Thread {
	
	@Override
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("This is run Method "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		Threadisalive threadisalive=new Threadisalive();
//	    System.out.println(Thread.currentThread().getName());
		 System.out.println("Before calling Thread class run Method "+"  "+Thread.currentThread().isAlive()+"  "+threadisalive.isAlive()+" "+threadisalive.getName());
		 threadisalive.start();
		 System.out.println("After Calling Thread class run Method "+"  "+Thread.currentThread().isAlive()+"  "+threadisalive.isAlive()+" "+threadisalive.getName());
		 
		 System.exit(0);
		 
		 System.out.println(Thread.currentThread().isAlive());

	}

}
