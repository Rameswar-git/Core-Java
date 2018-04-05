package ProducerAndConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer1 extends Thread {
	
	BlockingQueue<String> bq;
	
	Producer1(){
		bq=new ArrayBlockingQueue<>(5);
	}
	
	public void run(){
		for(int i=0;i<5;i++){
			try {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Producer is Producing"+" str "+i);
				bq.put("Str"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
