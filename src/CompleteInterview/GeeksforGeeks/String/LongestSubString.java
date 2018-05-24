package CompleteInterview.GeeksforGeeks.String;

public class LongestSubString {

	public static void main(String[] args) {
		
		String st1="abcdxyz";
		String st2="xyzabcd";
		
		String maxst="";
		
		for (int i = 1,k=st2.length(); i <= st2.length() && k>=0; i++,k--) {
			
			if(st1.contains(st2.substring(0,i)) && maxst.length() < st2.substring(0,i).length()) {
				maxst=st2.substring(0,i);	
			}
			if(st1.contains(st2.substring(k,st2.length())) &&  maxst.length() < st2.substring(0,i).length()) {
				maxst=st2.substring(k,st2.length());	
			}
			
		}
		
		System.out.println(" The Longest Common String between this two is "+maxst+" and its length is "+maxst.length());

	}

}
