package ThisTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessBuilderDemo {
	public static void main(String[] args) throws IOException {
		// This code demonstrate using Java ProcessBuilder class to run a batch
		// file
		// Java ProcessBuilder and BufferedReader classes are used to implement
		// this.
		System.out.println(" ");
		System.out.println("==========Arguments Passed From Command line===========");
		for (String s : args) {
			// Iterate through String array in Java (args list)
			System.out.println(s);
		}
		System.out.println("============================");
		System.out.println(" ");
		final StringBuffer sb = new StringBuffer();
		int processComplete = -1;
		ProcessBuilder pb = new ProcessBuilder(args);
		pb.redirectErrorStream(true);
		try {
			final Process process = pb.start();
			final InputStream is = process.getInputStream();
			// the background thread watches the output from the process
			new Thread(new Runnable() {
				public void run() {
					try {
						BufferedReader reader = new BufferedReader(
								new InputStreamReader(is));
						String line;
						while ((line = reader.readLine()) != null) {
							sb.append(line).append('\n');
						}
					} catch (IOException e) {
						System.out
								.println("Java ProcessBuilder: IOException occured.");
						e.printStackTrace();
					} finally {
						try {
							is.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
			// Wait to get exit value
			// the outer thread waits for the process to finish
			processComplete = process.waitFor();
			System.out.println("Java ProcessBuilder result:" + processComplete);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Java ProcessBuilder - return=: " + sb.toString());
	}
}
