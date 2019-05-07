package Threading.Basic;

class Runner3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			System.out.println("Runner1: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Runner4 extends Thread {

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

public class SimpleThreadCreationOtherWay {

	public static void main(String[] args) {

		// Thread t1 = new Thread(new Runner1());
		// Thread t2 = new Thread(new Runner2());

		Runner3 t1 = new Runner3();
		Runner4 t2 = new Runner4();

		t1.start();
		t2.start();
	}
}