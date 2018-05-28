package CompleteInterview;

public class PerfectNumber {

	public static void main(String[] args) {
		for (int i = 5; i < 10000; i++) {
			int count=0;
             for (int j = 1; j < i; j++) {
				
            	 if(i % j == 0) {
            		 count+=j;
            	 }
            	 
            	 
			}
             
             if(i == count) {
            	System.out.println(" i "+i+" is a perfect Number");
             }
		}
	}

}
