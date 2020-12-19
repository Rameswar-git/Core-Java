package CompleteInterview.GeeksforGeeks.String;

public class FormPalindrome {

//	public static void main(String[] args) {
//		
//		String name="abcd";
//		
//		String req="";
//		
//		StringBuffer buf=new StringBuffer(name).reverse();
//		
//	if(buf.toString().equals(name)) {
//		System.out.println(" The No of Characters required to the string palindrome is 0 ");
//	 }else {
//		 req=name.substring(1,name.length());
//		 name=new StringBuffer(name.substring(1,name.length())).reverse()+name;
//		 StringBuffer buf2=new StringBuffer(name).reverse();
//		 if(buf2.toString().toString().equals(name)) {
//			 System.out.println(" Required No Of characters to make the string palinfrome is "+req+" length is "+req.length());
//		 }
//	 }
//	
//
//	}

	static int findMinInsertions(char str[], int l, int h) {
// Base Cases
		if (l > h)
			return Integer.MAX_VALUE;
		if (l == h)
			return 0;
		if (l == h - 1)
			return (str[l] == str[h]) ? 0 : 1;

// Check if the first and last characters
// are same. On the basis of the  comparison
// result, decide which subrpoblem(s) to call
		if(str[l] == str[h]) {
			return findMinInsertions(str, l + 1, h - 1);
		}else {
			int a = findMinInsertions(str, l, h - 1);
			int b = findMinInsertions(str, l + 1, h);
			int min = Integer.min(a , b );
			return min+1;
		}
	}

// Driver program to test above functions
	public static void main(String args[]) {
		String str = "geeks";
		System.out.println(findMinInsertions(str.toCharArray(), 0, str.length() - 1));
	}

}
