package CompleteInterview;

public class AnagramSubString {

	public static void main(String[] args) {
		System.out.println(checkAnagram("ydg", "afyzxydgxzyxksldfm"));
	}

	private static boolean checkAnagram(String string, String string2) {

		int n = string.length();
		int b = string2.length();

		if (n > b) {
			return false;
		}
		
		boolean[] arr=new boolean[256];
		
		for (int j = 0; j < n ; j++) {
			arr[string.charAt(j)]=true;
		}
		
          int count=0;
		for (int i = 0; i < b; i++) {
              if(arr[string2.charAt(i)] == true) {
            	  count++;
            	  if(count == n) 
            		  return true;
            	  
            	  
              }else {
            	  count=0;
              }
		}

		return false;
	}

}
