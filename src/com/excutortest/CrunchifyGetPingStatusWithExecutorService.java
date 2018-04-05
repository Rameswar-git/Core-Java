package com.excutortest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class CrunchifyGetPingStatusWithExecutorService {

	private static final int MYTHREADS = 30;
	 
	public static void main(String args[]) throws Exception {
//		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		String[] hostList = { "http://crunchify.com", "http://yahoo.com",
				"http://www.ebay.com", "http://google.com",
				"http://www.example.co", "https://paypal.com",
				"http://bing.com/", "http://techcrunch.com/",
				"http://mashable.com/", "http://thenextweb.com/",
				"http://wordpress.com/", "http://wordpress.org/",
				"http://example.com/", "http://sjsu.edu/",
				"http://ebay.co.uk/", "http://google.co.uk/",
				"http://www.wikipedia.org/",
				"http://en.wikipedia.org/wiki/Main_Page" };
		MyRunnable worker =  new MyRunnable();
		for (int i = 0; i < hostList.length; i++) {
 
			String url = hostList[i];

			System.out.println(worker.hashCode());
			worker.run(url);
//		    Thread thread=new Thread(worker);
//		    thread.start();
//			executor.execute(worker);
		}
//		executor.shutdown();
//		while (!executor.isTerminated()) {
// 
//		}
		System.out.println("\nFinished all threads");
	}
 
}
