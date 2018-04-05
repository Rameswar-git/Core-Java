package com.liang.chpter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExp {

	public static void main(String[] args) {
		List<Integer> lis= new ArrayList<>();
   
		lis.add(1);
		lis.add(1);
		lis.add(2);
		lis.add(3);
		lis.add(4);
		
//		System.out.println(Collections.frequency(lis, 2));
		
		lis.stream().forEach(x -> System.out.println(x+" => "+Collections.frequency(lis, x)));
		
//		List<Integer> lis2=lis.stream().distinct().collect(Collectors.toList());
		
//		lis2.forEach(System.out::println);
		
	}

}
