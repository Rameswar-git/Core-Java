package CompleteInterview;

import java.util.Arrays;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		
		 String[] names = {"John", "Jammy", "Luke"};
		 
		 System.out.println(" Before reverse Array elemnts are "+Arrays.toString(names));
		 
		 ReverserInPlace(names);
		 
		 System.out.println(" After reverse Array elemnts are "+Arrays.toString(names));
		 
	}

	private static void ReverserInPlace(String[] names) {
		
		if(names == null || names.length < 2) {
			return;
		}else {
			for (int i = 0; i < names.length/2 ; i++) {
				String temp=names[i];
				names[i]=names[names.length-1-i];
				names[names.length-1-i]=temp;
			}
		}
		
	}

}
