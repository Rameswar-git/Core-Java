package CompleteInterview;

public class ReverserNumber {

	public static void main(String[] args) {
         int no=123;
         int rev = 0,a=0;
         
         
         while(no>0) {
        	 a=no%10;
        	 rev=rev*10+a;
        	 no=no/10;
         }
         
         System.out.println(rev);
         
	}

}
