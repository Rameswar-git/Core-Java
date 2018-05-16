package CompleteInterview;

import java.time.LocalDate;

public class LeapYear {

	public static void main(String[] args) {
		
		LocalDate dt=LocalDate.of(2000, 12, 31);
		
		System.out.println(dt.isLeapYear());

	}

}
