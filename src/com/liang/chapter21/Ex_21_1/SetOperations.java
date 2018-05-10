package com.liang.chapter21.Ex_21_1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) { //  {  ,  , ,  , 
		Set<String> st1 = new LinkedHashSet<>();
		st1.add("George");
		st1.add("Jim");
		st1.add("John");
		st1.add("Blake");
		st1.add("Kevin");
		st1.add("Michael");
		
		Set<String> st2 = new LinkedHashSet<>();		
		st2.add("George");	
		st2.add("Katie");
		st2.add("Kevin" );
		st2.add("Michelle");
		st2.add("Ryan");
		
		Set<String> union=new LinkedHashSet<>(st1);
		
		union.addAll(st2);
		
		System.out.println(" Union Of the 2 Sets are "+union);
		
		Set<String> difference=new LinkedHashSet<>(st1);
		
		difference.removeAll(st2);
		
		System.out.println(" Difference oF the sets is "+difference);
		
		Set<String> intersection=new HashSet<>();
		
		st1.forEach(x -> {
			if(st2.contains(x)) {
				
				intersection.add(x);
			}
		});
		
		
//		st2.forEach(x -> {
//			if(st1.contains(x)) {
//				intersection.add(x);
//			}
//		});
		
		System.out.println(" Intersection of the 2 set is "+intersection);
		
		
	}

}
