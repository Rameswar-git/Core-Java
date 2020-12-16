package CompleteInterview.oops.overriding;

import java.io.FileNotFoundException;

class Parent {
	public void testException() throws NullPointerException{} // Unchecked Exception
	public void testCheckedException() throws FileNotFoundException{} // checked Exception
}

public class OveriddingWithException extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Child Class Overridden Method can declare Unchecked Exception of parent type
	@Override
	public void testException() throws RuntimeException { super.testException();} 
	
	 // but below will show compile time error checked Exceptions parent type can not 
//	@Override
//	public void testCheckedException() throws IOException{}
	
	

}
