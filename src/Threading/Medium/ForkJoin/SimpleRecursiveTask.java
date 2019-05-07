package Threading.Medium.ForkJoin;

import java.util.concurrent.RecursiveTask;

public class SimpleRecursiveTask extends RecursiveTask<Integer> {

	private int simulatedWork;
	
	public SimpleRecursiveTask(int simulatedWork) {
		this.simulatedWork = simulatedWork;
	}
	
	@Override
	protected Integer compute() {
		
		if( simulatedWork > 100 ) {
			
			System.out.println("Parallel execution and split the tasks..." + simulatedWork);
			
			SimpleRecursiveTask simpleRecursiveAction1 = new SimpleRecursiveTask(simulatedWork/2);
			SimpleRecursiveTask simpleRecursiveAction2 = new SimpleRecursiveTask(simulatedWork/2);
			
			simpleRecursiveAction1.fork();
			simpleRecursiveAction2.fork();
			
			int solution = 0;
			solution = solution + simpleRecursiveAction1.join();
			solution = solution + simpleRecursiveAction2.join();
			
			return solution;
			
		} else {
			System.out.println("No need for parallel execution, sequential is OK for this task..." );
			return 2 * simulatedWork;
		}
	}
}
