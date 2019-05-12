package Threading.Medium.DifferentClasses.ReadWriteLock;

import java.util.Random;

public class ReaderThread extends Thread {
	private ThreadSafeList<Integer> sharedList;
	Random random = new Random();
	public ReaderThread(ThreadSafeList<Integer> lst) {
		this.sharedList = lst;
	}

	@Override
	public void run() {
		int nextInt = random.nextInt(sharedList.size());
		Integer integer = sharedList.get(nextInt);
		System.out.println("Read Element -> "+integer);
	}
	
	
}
