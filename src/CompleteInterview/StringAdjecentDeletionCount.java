package CompleteInterview;

import java.util.ArrayList;
import java.util.List;

public class StringAdjecentDeletionCount {

	public static void main(String[] args) {
		String s = "AAABCCCCCCF";
		StringBuilder build = new StringBuilder(s).delete(4, 9);
		System.out.println(build.toString());
		getNoofDelations(s);
	}

	private static int getNoofDelations(String s) {
		StringBuilder build = new StringBuilder(s);
		List<Integer> deleteindexes=new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			int repeatcount =0;
			char matchar=s.charAt(i);
			int j=i+1;
			while(j < s.length() && matchar == s.charAt(j)){
				repeatcount++;
				deleteindexes.add(j);
				j++;
			}
			if(repeatcount > 0){
				i=i+repeatcount-1;
			}
		}
		return deleteindexes.size();
	}

}
