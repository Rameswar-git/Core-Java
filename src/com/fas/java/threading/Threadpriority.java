package com.fas.java.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;




public class Threadpriority implements Callable<String> ,ThreadFactory {
	


	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newFixedThreadPool(3,new Threadpriority());
		Threadpriority tp1=new Threadpriority();
		Threadpriority tp2=new Threadpriority();
		Threadpriority tp3=new Threadpriority();

//		tp1.setName("Normal");
//		tp1.setPriority(NORM_PRIORITY);
//		tp2.setPriority(MAX_PRIORITY);
//		tp2.setName("Max");
//		tp3.setPriority(MIN_PRIORITY);
		
		List<Callable<String>> tst=new ArrayList<Callable<String>>();
		tst.add(tp1);
		tst.add(tp2);
		tst.add(tp3);
		
		List<Future<String>> tsb=executorService.invokeAll(tst);
		
		for(Future<String> jshdc:tsb){
			
			System.out.println(jshdc.get());
			
		}
		
//		tp3.setName("Min");
//         List<Future<String>>
		System.out.println("Finished");
		
		executorService.shutdown();
//		executorService.invokeAll(tasks)
//		executorService.ex
//		tp1.start();
//		tp2.start();
//		tp3.start();
	}

	@Override
	public String call() throws Exception {
//		System.out.println(Thread.currentThread().getPriority()+"  "+Thread.currentThread().getName());
		return Thread.currentThread().getPriority()+"  "+Thread.currentThread().getName();
	}

	@Override
	public Thread newThread(Runnable r) {
	     Thread t =  new Thread(r);
	     t.setName("Test");
	     t.setPriority(Thread.MAX_PRIORITY); //Or whatever priority
	     return t;

	}

}
