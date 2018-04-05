package com.singleton.test;

import java.util.concurrent.TimeUnit;

public class Consumer extends Thread{
	Producer producer;
	
	public Consumer(Producer prod){
		this.producer=prod;
	}
	
	@Override
	public void run(){
		try {
			for(int i=0;i<10000;i++){
				System.out.println("Conumer Consuming Product "+producer.blockingQueue.poll(10,TimeUnit.SECONDS));	
			}			
		} catch (InterruptedException e) {
			e.printStackTrace();
		};
	}

}
