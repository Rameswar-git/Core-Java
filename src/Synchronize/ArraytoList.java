package Synchronize;

import java.util.Arrays;
import java.util.stream.LongStream;

public class ArraytoList {

	public static void main(String[] args) {
		
		long[] intarr={1,2,3,4,5,6,7};
		String[] strarr={"A","B","C"};

		boolean st=Arrays.stream(strarr).anyMatch("Z"::equals);
		
		if(st){
			System.out.println(strarr.toString());
		}
		
		
		boolean ram=LongStream.of(intarr).anyMatch(x -> x == 5);
		
		if(ram){

		}
		
	}

}
