package Synchronize;

public class MultiplicationTable{
	
	public synchronized void table(int n){
		for(int i=0;i<=10;i++){
			
			System.out.println(n * 5);		
			System.out.println(Thread.currentThread().getName());
		}
	}

}
