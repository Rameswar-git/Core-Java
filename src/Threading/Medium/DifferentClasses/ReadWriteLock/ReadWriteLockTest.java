package Threading.Medium.DifferentClasses.ReadWriteLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReadWriteLockTest {
	static final int READER_SIZE = 9;
	static final int WRITER_SIZE = 3;

	public static void main(String[] args) {
		Integer[] initialElements = { 33, 28, 86, 99 };
		ThreadSafeList<Integer> list = new ThreadSafeList<>(initialElements);
		ExecutorService threadpool = Executors.newCachedThreadPool();
		try {
			for (int i = 0; i < READER_SIZE; i++) {
				threadpool.execute(new ReaderThread(list));
			}
			for (int i = 0; i < WRITER_SIZE; i++) {
				threadpool.execute(new WriterThread(list));
			}
		} catch (Exception e) {
			System.out.println("Exception in Thread Execution"+e.getMessage());
		}finally {
			threadpool.shutdownNow();
		}

	}

}
