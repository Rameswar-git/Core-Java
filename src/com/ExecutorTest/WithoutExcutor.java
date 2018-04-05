package com.ExecutorTest;

public class WithoutExcutor {

	public static void main(String[] args) {
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
		for (int i = 0; i < hostList.length; i++) {
			String url = hostList[i];	
			MyRunnable2 mr=new MyRunnable2(url);
			mr.run();
		}		
		System.out.println("\nFinished all threads");	
	}

}
