package CompleteInterview.Algorithams;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] nos = { 9, 3, 5, 8, 2, 6 };
		
            for (int i = 0; i < nos.length; i++) {
            	for (int j = 0; j < nos.length-1; j++) {
					int k=j+1;
						if (nos[k] < nos[j]) {
							int temp =nos[k];
							nos[k] = nos[j];
							nos[j] = temp;	
						}

					
						
				}
				
			}

//				if (nos[count] > nos[k]) 
//				int temp = nos[count];
//				nos[count] = nos[k];
//				nos[k] = temp;		
		System.out.println(Arrays.toString(nos));

	}

}
