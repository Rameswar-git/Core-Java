package Usefulprograms.Java8DistinctObjectFilter;

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
		
		
//		List<Developer> devs5=devs.stream().distinct().collect(Collectors.toList()); // This distinct Will Not Work in case of objects 
		
		Set<String> sdevs=new HashSet<>();
		
		devs.removeIf(f -> !sdevs.add(f.getName()));
		
		System.out.println(sdevs);

	}

}
