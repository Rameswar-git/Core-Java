package CompleteInterview;

public class LongestPrefix {

	public static void main(String[] args) {
       String text1="Welcome to Java";
       String text2="Welcome to c++";
       
       for (int i = 0; i < text1.length(); i++) {
		
    	   if(text2.contains(text1.substring(0, i))) {
    		   continue;
    	   }else {
    		   
    		   System.out.println("The Logest prefix is "+text2.substring(0, i-1));
    		   break;
    	   }
	}
       
	}

}
