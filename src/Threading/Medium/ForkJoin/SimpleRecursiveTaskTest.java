package Threading.Medium.ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class SimpleRecursiveTaskTest {

	public static void main(String[] args) {
		
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveTask simpleRecursiveAction = new SimpleRecursiveTask(20);
		System.out.println( forkJoinPool.invoke(simpleRecursiveAction) );
		
		
	}
}
