package com.liang.chapter21.Ex_21_6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MaxOccurancesOFNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter any No ");
		int no=scan.nextInt();
		System.out.println(" The Number is "+no);
		
		Map<Integer,Integer> nos=new HashMap<>();
		
		nos.put(no, 1);
		
		while(no>0) {
			no=scan.nextInt();
			if(no>0 && nos.containsKey(no)) {
				nos.put(no, nos.get(no)+1);
			}else if(no > 0){
				nos.put(no, 1);
			}
		}
		
		
//		
		Entry<Integer, Integer> sdc= 	nos.entrySet().stream().max(Comparator.comparing(x -> x.getValue())).get();
		//
		System.out.println(sdc.getKey()+"  "+sdc.getValue());
		
		scan.close();

	}

}
