package CompleteInterview;

import java.util.Scanner;

public class SimpleIntrestCalculator {

	public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          System.out.println(" Enter The Deposit Amount ");
          double deposit=scan.nextDouble();
          System.out.println(" Enter The Annual intrest rate ");
          double intrestrate=scan.nextDouble();
          double monthlyintrest=intrestrate/1200;
          System.out.println(" Enter The No of Months To Calculate ");
          int noofyears=scan.nextInt();
          for (int i = 1; i <= noofyears; i++) {
        	  deposit += (deposit*monthlyintrest);
		}
          
          System.out.println(" The Final Amount Become "+deposit);
	}

}
