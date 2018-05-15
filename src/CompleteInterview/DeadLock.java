package CompleteInterview;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {
	
	public static final Lock lck=new ReentrantLock();

	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println(" A Trying to get Lock ");
				lck.lock();
				System.out.println(" A got The lock ");
				new Thread() {
					@Override
					public void run() {
						try {
							System.out.println(" B trying to get Lock ");
							lck.lock();
							System.out.println(" B got the lock ");
						} finally {
							System.out.println(" B Trying to Release the lock  ");
							lck.unlock();
							System.out.println(" B to Release the lock  ");
							
						}

					}
					
				}.start();;
				
			}
		}.start();;
		
		

	}

}
