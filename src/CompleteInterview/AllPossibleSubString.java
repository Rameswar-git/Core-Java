package CompleteInterview;

public class AllPossibleSubString {

	public static void main(String[] args) {
		String text = "Hello";
		
       for (int j = 0; j <= text.length(); j++) {
   		for (int i = j; i <= text.length(); i++) {
            System.out.print(text.substring(j,i)+"\n"); 
            // if we put it   System.out.print(text.substring(i,text.length())+"\n"); 
            // Result will be like below
   		 
//   		Hello
//   		ello
//   		llo
//   		lo
//   		o
//
//
//   		ello
//   		llo
//   		lo
//   		o
//
//
//   		llo
//   		lo
//   		o
//
//
//   		lo
//   		o
//
//
//   		o

 		}
   		System.out.println();
	}

	}

}
