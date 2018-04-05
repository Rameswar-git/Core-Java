package com.singleton.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
	BlockingQueue<String> blockingQueue;
	
	public Producer() {
		blockingQueue=new ArrayBlockingQueue<>(10000);
	}
	
	@Override
	public void run(){
		for(int i=0;i<10000;i++){
			System.out.println("Producer Producing Product "+"str"+"- "+i);
			blockingQueue.add("str- "+i);
		}
	}

}
