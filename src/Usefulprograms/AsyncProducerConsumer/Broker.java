package Usefulprograms.AsyncProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Broker {
	ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(10000);
	boolean isproducing=Boolean.TRUE;
	
	public void set(String txt) throws InterruptedException{
		queue.put(txt);
	}
	
	public String get() throws InterruptedException{
		return queue.poll(10, TimeUnit.SECONDS);
	}

}
