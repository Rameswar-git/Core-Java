package CompleteInterview;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EMICalculator {

	public static void main(String[] args) {
		DecimalFormat ft = new DecimalFormat("############################.###");
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter The Loan Amount ");
		double loanamount = scan.nextDouble();
		System.out.println(" Enter The No Of Years");
		int years = scan.nextInt();
		System.out.println(" Enter The Rate of Intrest per Annual ");
		double rate = scan.nextDouble();

		double monthlyintrestrate = rate / 1200;

		double MonthlyEMI = (loanamount * monthlyintrestrate)
				/ (1 - (1 / Math.pow(1 + monthlyintrestrate, years * 12)));
		System.out.printf(" Monthly EMI is %.2f ", MonthlyEMI);

		System.out.println(" Total Payment After " + years + " is " + ft.format((MonthlyEMI * 12 * years)));

		scan.close();

	}

}
