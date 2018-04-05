package ProducerAndConsumer;

public class ProducerConsumer {

	public static void main(String[] args) {
		
		
		Producer1 p1=new Producer1();
		Consumer1 c1=new Consumer1(p1);
		
		p1.start();
		c1.start();
		

	}

}
