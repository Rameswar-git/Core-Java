package CompleteInterview;

import java.util.Scanner;

public class MonthlyDepositInLICCalculation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print(" Enter The Monthly Amount ");
	    double mamount=scan.nextDouble();
	    System.out.print("\n Enter The Intrest Rate ");
	    double intrestrate=scan.nextDouble();
	    double monthlyintrest=intrestrate/1200;
	    System.out.println(" Enter The No of Months To Calculate The Premium ");
	    int months=scan.nextInt();
	     double totalamout=0.00;
	    for (int i = 1 ; i <= months; i++) {
	    	totalamout=(mamount+totalamout)*(1+monthlyintrest);
		}
	    
	    System.out.println(" Total Amout is "+totalamout);
	    
	}

}
