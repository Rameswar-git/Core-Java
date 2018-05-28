package CompleteInterview;

public class CheckStringRotation {

	public static void main(String[] args) {
		
		String str1 = "amazon";

		String str2 = "onamaz";


		  boolean test= (str1.length() == str2.length()) &&
	               ((str1 + str1).indexOf(str2) != -1);
		  
		  if(test) {
			  System.out.println(" Both are rotation of each other");
		  }else {
			  System.out.println(" No Both are not rotation of each other ");
		  }
	}

}
