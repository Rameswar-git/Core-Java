package Usefulprograms;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

import com.rameswar.hackerRank.PS.Test;
import com.rameswar.hackerRank.PS.TheFullCountingSort;


public class ExecutionTimeProvider {
	public static void main(String[] args) throws IOException {
		callTestMethod();
//		callOthercallMethod();
	}
	
	private static void callOthercallMethod() throws FileNotFoundException {
		Instant start = Instant.now();
		TheFullCountingSort.main(null);
		timeTaken(start,Instant.now());
	}

	private static void callTestMethod() throws IOException {
		Instant start = Instant.now();
		Test.main(null);
		timeTaken(start,Instant.now());
	}
	
	public static void timeTaken (Instant start,Instant end) {
        Duration between = Duration.between(start, end);
		System.out.format("%d Hrs:%d Min:%d Sec:%d Miliseconds \n",
		        between.toHours(), between.toMinutes(), between.getSeconds(), between.toMillis());
	}
}
