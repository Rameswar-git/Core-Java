package ProducerAndConsumer;


public class Consumer1 extends Thread{
	
	Producer1 prod;
	
	Consumer1(Producer1 produ){
		this.prod=produ;
	}
	
	@Override
	public void run(){
		
		for(int i=0;i<5;i++){
			
			try {
//				System.out.println(Thread.currentThread().getName());
				System.out.println("Consumer Consumeing"+prod.bq.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
