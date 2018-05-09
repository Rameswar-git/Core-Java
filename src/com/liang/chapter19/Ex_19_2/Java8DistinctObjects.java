package com.liang.chapter19.Ex_19_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8DistinctObjects {

	public static void main(String[] args) {
		
		List<Developer> devs=new  ArrayList<>();
		
		Developer dev=new Developer(15,"Test");	
		Developer dev2=new Developer(16,"Test");	
		Developer dev3=new Developer(16,"Har");	
		
		devs.add(dev);
		devs.add(dev2);
		devs.add(dev3);
		
		
		devs=devs.stream().distinct().collect(Collectors.toList());
		
		Set<String> sdevs=new HashSet<>();
		
		devs.removeIf(f -> !sdevs.add(f.getName()));
		
		System.out.println(devs);

	}

}
