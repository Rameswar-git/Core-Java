package Threading.Medium.DifferentClasses.ReadWriteLock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeList<E> {
	private List<E> lst = new ArrayList<>();
	private ReadWriteLock lck = new ReentrantReadWriteLock(true);
	
	public ThreadSafeList(E... initialElements) {
        lst.addAll(Arrays.asList(initialElements));
    }
	public void add(E element) {
		 Lock writelck = lck.writeLock();
		try {
			writelck.lock();
			lst.add(element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			writelck.unlock();
		}
	}

	public E get(int element) {
		 Lock readlck = lck.readLock();
		try {
			readlck.lock();
			return lst.get(element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		} finally {
			readlck.unlock();
		}
	}

	public Integer size() {
		Lock readlck = lck.readLock();
		try {
			readlck.lock();
			return lst.size();
		} catch (Exception e) {
			return 0;
		}finally {
			readlck.unlock();
		}
	}
}
