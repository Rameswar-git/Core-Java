package com.fas.asyncproducerconsumer;


public class Producer implements Runnable {
	Broker br;
	
	public Producer(Broker broke){
		this.br=broke;
	}

	@Override
	public void run() {
		 System.out.println("Produ::"+Thread.currentThread().getName());
		for(int i=0;i<10;i++){
			try {
//				 System.out.println("Produ::"+Thread.currentThread().getName());
				double d=Math.random();
//				System.out.println("Producer Producing Policy "+" VPC-> "+d);
				this.br.set("VPC->"+d);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
		this.br.isproducing=Boolean.FALSE;
		System.out.println("Producer producing products");
 
	}

}
