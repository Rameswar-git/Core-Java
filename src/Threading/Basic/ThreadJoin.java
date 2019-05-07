package Threading.Basic;

class Runner5 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; ++i) {
			System.out.println("Runner1: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Runner6 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			System.out.println("Runner2: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoin {

	public static void main(String[] args) {

		// Thread t1 = new Thread(new Runner1());
		// Thread t2 = new Thread(new Runner2());

		Runner5 t1 = new Runner5();
		Runner6 t2 = new Runner6();

		t1.start();
		t2.start();

		try {
			t1.join();
			// t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Finished the tasks...");
	}
}
