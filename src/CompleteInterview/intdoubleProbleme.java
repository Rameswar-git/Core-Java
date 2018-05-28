package CompleteInterview;

public class intdoubleProbleme {
	
	

	public static void main(String[] args) {
		double result=0.00;
		
		for (int i = 1; i <= 5 ; i++) {
			result+=1/Fact(i);
		}
		
		System.out.println(" Final Sum is "+result);
		
	}

	private static double Fact(int i) {
		
		double fact=1;  // Here if we Change from double to integere Then Probleme 
		
//		System.out.print("Factorial of "+i+" is  ");
		
		while(i>0) {
			fact*=i;
			i--;
		}
		
//		System.out.print(fact+"\n");
		return fact;
	}

}
