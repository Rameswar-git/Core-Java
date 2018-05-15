package CompleteInterview;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockAvoid {

	private static final Lock lck = new ReentrantLock();

	public static void main(String[] args) {

		new Thread() {
			@Override
			public void run() {
				System.out.println(" A Trying to get the Lock ");
				lck.lock();
				System.out.println(" A got  The Lock ");
				lck.unlock();
				System.out.println(" A Released The Lock ");
				new Thread() {
					@Override
					public void run() {
						System.out.println(" B Trying to get Lock ");
						lck.lock();
						System.out.println(" B got The Lock ");
						lck.unlock();
						System.out.println(" B Released The Lock ");
					}
					
				}.start();
			}

		}.start();;

	}

}
