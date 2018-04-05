package com.arralisteaxmple;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSplit {

	public static void main(String[] args) {
         String stri="15,16,17,18,19,11,1,2,32,33,34,35,36,5,6,7,8,9,13,3,4,10,20,21,22,23,24,41,54,38";
         List<String> num=Arrays.asList(stri.split(","));
         num.forEach(System.out::println);
	}
	
	private String Stringtest() {
		
		String name ="VPC,VGC";
		String joined="";
//		String sam=name.join(",", "Har");
		if(name.startsWith("VPC")){
			joined = StringJointets(joined,"VPC_COMP","");
		}
		
		if(name.contains("VGC")){
			joined = StringJointets(joined,"VGC_COMP","VGC_LIB");
		}

//		String.join(",", name,"Har");
		
//		name=Stream.of(name,"Test").filter(s -> s != null && !s.isEmpty()).collect(Collectors.joining(","));
		
		return joined;
		
	}

	public String StringJointets(String string, String string2, String string3) {
		return Stream.of(string,string2,string3)
		      .filter(s -> s != null && !s.isEmpty())
		      .collect(Collectors.joining(","));
	}

}
