package com.Java8.SortCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparabelTest {

	public static void main(String[] args) {
		List<Student> std = new ArrayList<>();
		
		Student stt=new Student(83, "Zeb");
		Student st2=new Student(18, "Shat");
		Student st3=new Student(52, "West");
		Student st4=new Student(52, "Ab");
		
		std.add(stt);
		std.add(st2);
		std.add(st3);
		std.add(st4);
		
		System.out.println(std);
		
//		Collections.sort(std);
		
//		std.sort(Comparator.comparing(a -> a));
		
//		System.out.println(std.toString());
		
//		Collections.sort(std,(Student s1,Student s2) -> s1.getName().compareTo(s2.getName()));
		
		std.sort((Student s1,Student s2) -> s1.getName().compareTo(s2.getName()));
		
		
		System.out.println(std);


	}

}
