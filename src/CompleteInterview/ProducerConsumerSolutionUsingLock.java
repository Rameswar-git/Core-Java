package CompleteInterview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ProducerConsumerSolutionUsingLock  {

	public static void main(String[] args) {
		producerconsumerimpl share = new producerconsumerimpl();
		Producer prod = new Producer(share);
		Consumer cons = new Consumer(share);
		
		prod.start();
		cons.start();

	}
}

class producerconsumerimpl {
	private final static int BUFFER_SIZE = 5;
	private final Random ran = new Random();
	private final Lock lck = new ReentrantLock();
	private Queue<Integer> que = new LinkedList<>();
	private final Condition Bufferfull = lck.newCondition();
	private final Condition DataAvlibel = lck.newCondition();

	public void put() throws InterruptedException  {
		lck.lock();
		try {
			while (que.size() == BUFFER_SIZE) {
				System.out.println(Thread.currentThread().getName() + " : Buffer is full, waiting");
				Bufferfull.await();
			}
			int number = ran.nextInt();
			boolean isAdded = que.offer(number);
			if (isAdded) {
				System.out.printf("%s added %d into queue %n", Thread.currentThread().getName(), number);

				// signal consumer thread that, buffer has element now
				System.out.println(Thread.currentThread().getName() + " : Signalling that buffer is no more empty now");
				DataAvlibel.signalAll();
			}
		} finally {
			lck.unlock();
		}
	}

	public void get() throws InterruptedException {
		lck.lock();
		try {
			
			while (que.size() == 0) {
				System.out.println(Thread.currentThread().getName() + " : Buffer is empty, waiting");
				DataAvlibel.await();
			}

			System.out.println(que.poll());
			Bufferfull.signalAll();

		} finally {
			lck.unlock();
		}
	}
}

class Producer extends Thread {
	producerconsumerimpl pc;

	public Producer(producerconsumerimpl sharedObject) {
		super("PRODUCER");
		this.pc = sharedObject;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 30; i++) {
				pc.put();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

 class Consumer extends Thread {
	producerconsumerimpl pc;

	public Consumer(producerconsumerimpl sharedObject) {
		super("CONSUMER");
		this.pc = sharedObject;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 30; i++) {
				pc.get();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
