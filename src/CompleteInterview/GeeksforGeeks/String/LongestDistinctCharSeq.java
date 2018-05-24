package CompleteInterview.GeeksforGeeks.String;

public class LongestDistinctCharSeq {

	public static void main(String[] args) {
		
		String name="abababcdefababcdab";
		
		int start=0;
		
		int end=name.length()-1;
		
		int maxlength=0;
		
		int n=name.length()-1;
		
		while(n > 0) {
			char c=name.charAt(n);
			int last=n;
			while(true && n>0) {
				if(c == name.charAt(n-1)) {
					if((last-n)>maxlength) {
						start=n;
						end=last;
						maxlength=last-n;
					}
					break;
				}else {
					n--;
				}	
			}
			n--;
		}
		
		System.out.println(name.substring(start, end).length());

	}

}
