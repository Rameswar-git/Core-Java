package CompleteInterview;

import java.util.Scanner;

public class FahrenhitetoCelsius {

	public static void main(String[] args) {
		double fahrenhite=0;
       Scanner scan=new Scanner(System.in);
       System.out.println(" Enter Tempreture in Fahrehite ");
       fahrenhite=scan.nextInt();
       fahrenhite=((fahrenhite-32)*5)/9;
       System.out.printf(" Celcius Temp is %.3f\n",fahrenhite);
       scan.close();
	}

}
