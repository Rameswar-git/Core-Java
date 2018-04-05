package com.ExecutorTest;

import java.net.HttpURLConnection;
import java.net.URL;

public class MyRunnable implements Runnable {

	private final String url;
	 
	MyRunnable(String url) {
		this.url = url;
	}

	@Override
	public void run() {
       System.out.println(Thread.currentThread().getName());
		String result = "";
		int code = 200;
		try {
			URL siteURL = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) siteURL
					.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			code = connection.getResponseCode();
			if (code == 200) {
				result = "Green\t";
			}
		} catch (Exception e) {
			result = "->Red<-\t";
		}
		System.out.println(url + "\t\tStatus:" + result);
	}


}
