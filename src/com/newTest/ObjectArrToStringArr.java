package com.newTest;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObjectArrToStringArr {
	
	public static void main(String[] args) {
		Object[] objs=new Object[2];
		
		objs[0]="{AGCODE={value=AG5780}}";
		
		objs[1]="{OACODE={value=OA6398}}";
	
		
		Map<String,String> strs=Arrays.stream(objs).map(x -> x.toString().replaceAll("[{value}]", "")).flatMap(Stream::of)
				.map(d -> d.split("==")).collect(Collectors.toMap(g -> g[0], g -> g[1]));
		
		strs.forEach((k,v) -> System.out.println(" Key "+k+" Value "+v));
		
	}
	
}
