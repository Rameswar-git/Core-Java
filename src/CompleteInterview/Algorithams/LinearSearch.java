package CompleteInterview.Algorithams;

public class LinearSearch {

	public static void main(String[] args) {

		int[] ins = { 5, 8, 2, 6 };

		int searchelemnt = 8;

		for (int i = 0; i < ins.length; i++) {
             if(ins[i] == searchelemnt) {
            	 System.out.println(" The Search Element is Found in index Position "+i);
            	 break;
             }
		}

	}

}
