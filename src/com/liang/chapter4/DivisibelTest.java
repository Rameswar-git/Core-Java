package com.liang.chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DivisibelTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The  Number ::");
		int no=sc.nextInt();
		List<Integer> integers=new ArrayList<Integer>();
		
		for (int i = 2; i < 10 && no > 0; i++) {
			while(no % i == 0){
				if(integers.contains(i)) {
					Object o=i;
					integers.remove(o);
				}else {
					integers.add(i);
				}
				
				no=no/i;
			}
		}
		
		
		int integers5=integers.stream().reduce(1,(x,y) -> x*y);
		System.out.println(integers5);
		sc.close();
	}

}
