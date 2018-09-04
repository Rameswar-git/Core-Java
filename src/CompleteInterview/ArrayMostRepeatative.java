package CompleteInterview;

public class ArrayMostRepeatative {

	public static void main(String[] args) {
		int[] arrs = { 1, 5, 6, 1, 3, 4, 5, 1,6,5,5 };

		int maxno = arrs[0];
		int occurences = 1;

		for (int i = 0; i < arrs.length; i++) {
			int max=arrs[i];
			int occure=1;
			for (int j = i+1; j < arrs.length; j++) {
               if(max == arrs[j]) {
            	   occure++;
               }
			}

			if(occure > occurences) {
				maxno=max;
				occurences=occure;
			}
		}
		
		System.out.println(" The maximum occured element is "+maxno+" and its occurence is "+occurences);

	}

}
