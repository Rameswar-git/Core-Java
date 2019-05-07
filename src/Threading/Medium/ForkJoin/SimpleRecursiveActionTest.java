package Threading.Medium.ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class SimpleRecursiveActionTest {

	public static void main(String[] args) {
		
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(400);
		forkJoinPool.invoke(simpleRecursiveAction);
		
		
	}
}
