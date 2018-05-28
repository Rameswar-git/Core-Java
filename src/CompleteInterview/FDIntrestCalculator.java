package CompleteInterview;

public class FDIntrestCalculator {

	public static void main(String[] args) {
		
	    double A;
		float P,r,n,t;
		double I;
	    float temp;
	    P=10000;
	    r = 0.05f;
	    t=5;
	    n=3;
	    temp=(1+r/n);
	    A=P*Math.pow(temp,(n*t));
	   System.out.printf("\nFixed deposit: %.2f", A);
	    I=A-P;
	    System.out.printf("\nInterest Earned Amount: %.2f",I);

	} 

}
