package Synchronize;

public class ThreadPriority extends Thread {
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		tp1.setName("Thread One");
	    tp2.setName("Thred Two");
	    tp3.setName("Thread Three");
		tp3.setPriority(MAX_PRIORITY);
		tp3.start();
	    tp1.start();
	    tp2.start();
		
	}

}
