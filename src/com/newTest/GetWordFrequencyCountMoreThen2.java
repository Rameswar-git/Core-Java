package com.newTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GetWordFrequencyCountMoreThen2 {

	public static void main(String[] args) {
        String[] name= {"Ram","Har","Sam","Ram"};
        
        Set<String> nam=new HashSet<String>();
        
        Set<String> sv=Arrays.stream(name).filter(p -> !nam.add(p)).collect(Collectors.toSet());
        
        sv.forEach(System.out::println);
        
	}

}
