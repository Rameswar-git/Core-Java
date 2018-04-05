package com.fas.asyncproducerconsumer;

public class Consumer implements Runnable{
	Broker br;
	String name;
	
    public Consumer(String name,Broker broke) {
    	this.br=broke;
    	this.name=name;
	} 
	
	@Override
	public void run(){		
		try {			
			String data=this.br.get();	
             System.out.println("Cons::"+Thread.currentThread().getName());
			while (br.isproducing || data!=null) {
//				 System.out.println("Cons::"+Thread.currentThread().getName());
//			       System.out.println("Consumer Consuming Policy no "+data);		
			        data=this.br.get();				  
			}

			System.out.println("Consumer "+this.name+" Finished its Job of Consuming");
			
		} catch (Exception e) {
			
		}		
	}

}
