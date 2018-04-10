package com.newTest;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedWordInString {

	public static void main(String[] args) {
        String name="Rameswar Prasad Das is Rameswar rameswar";
        
        Map<String, Integer> mas=Arrays.stream(name.split(" ")).collect(Collectors.toMap(p -> p.toString(), p -> new Integer(1),(old,newd) -> old+1));
        
        System.out.println(mas);
	}

}
