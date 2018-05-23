package CompleteInterview;

import java.util.Scanner;

public class CelciusToFahrenhite {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter Tempreture in Celcius ");
		
		double celcius=scan.nextDouble();
		
		double fahrenhite=((9*celcius)/5)+32;
		
		System.out.println("its Fahranhite Conversion is "+fahrenhite);

	}

}
