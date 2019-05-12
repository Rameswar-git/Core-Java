package Threading.Medium.DifferentClasses.ReadWriteLock;

import java.util.Random;

public class WriterThread extends Thread {
	private ThreadSafeList<Integer> sharedList;
	Random random = new Random();

	public WriterThread(ThreadSafeList<Integer> lst) {
		this.sharedList = lst;
	}

	@Override
	public void run() {
		int val = random.nextInt(100);
		sharedList.add(val);
		System.out.println("Writing element -> " + val);
	}
}
