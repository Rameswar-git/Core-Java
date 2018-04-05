package com.singleton.test;


public class Producerconsumertest {

	public static void main(String[] args) {
//		 ExecutorService threadPool = Executors.newFixedThreadPool(3);

		 
		Producer producer=new Producer();
		Consumer son=new Consumer(producer);
		
//		 threadPool.execute(producer);
//		 threadPool.execute(son);

//		 threadPool.submit(son);
		 
		Long starttime=System.currentTimeMillis();
		producer.start();
		son.start();
        System.out.println("Time Taken To Process 10000 Policy is  s"+(System.currentTimeMillis()-starttime));
	}

}
