package Usefulprograms.AsyncProducerConsumer;
//Change
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncPeoducerConsumertest {

	public static void main(String[] args) {
		Broker broker=new Broker();
		ExecutorService executorService=Executors.newFixedThreadPool(10);
		
		long kn=Runtime.getRuntime().freeMemory();
		Future<?> producerstatus=null;
		
//		for (int i = 0; i < 10; i++) {
			executorService.execute(new Consumer("Consumer=1", broker));
			executorService.execute(new Consumer("Consumer=2", broker));
			producerstatus= executorService.submit(new Producer(broker));	
//			executorService.execute(new Producer(broker));
//		}
		
//		executorService.execute(new Consumer("Consumer=2", broker));
//		Future<?> producerstatus= executorService.submit(new Producer(broker));
		
		System.out.println(producerstatus.isDone());
		
		executorService.shutdown();
		
		long kn2=Runtime.getRuntime().freeMemory();
		
		System.out.println(kn-kn2);

	}

}
