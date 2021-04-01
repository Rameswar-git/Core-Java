package Usefulprograms;

import java.time.Duration;
import java.time.Instant;

import com.ramgeeks.Topics.Arrays.RearrangeNumbers;
import com.ramgeeks.Topics.Arrays.RearrangeNumbers2;


public class ExecutionTimeProvider {
	public static void main(String[] args) throws Exception {
		callTestMethod();
//		callOthercallMethod();
	}
	
	private static void callOthercallMethod() throws Exception {
		Instant start = Instant.now();
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		RearrangeNumbers.main(null);
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory used: "+(afterUsedMem-beforeUsedMem));
		timeTaken(start,Instant.now());
	}

	private static void callTestMethod() throws Exception {
		Instant start = Instant.now();
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		RearrangeNumbers2.main(null);
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory used: "+(afterUsedMem-beforeUsedMem));
		timeTaken(start,Instant.now());
	}
	
	public static void timeTaken (Instant start,Instant end) {
        Duration between = Duration.between(start, end);
		System.out.format("%d Hrs:%d Min:%d Sec:%d Miliseconds \n",
		        between.toHours(), between.toMinutes(), between.getSeconds(), between.toMillis());
	}
}
