package com.newTest;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class RepeatedCharSinString {

	public static void main(String[] args) {
          String test="Rameswar12goog12boyand he12nota boy";
          
//          Pattern pat= Pattern.compile("is");

//         Matcher mat= pat.matcher(test);
         
         
             System.out.println(Har(test));
         
//         while(mat.find()) {
//        	 System.out.println("Found is at index "+ mat.start() +" - "+ (mat.end()-1));
//         }
      
         
	}

	private static int Har(String test) {
		int cout=0;
			while(test.contains("12")) {
				test=test.substring(test.indexOf("12")+"12".length(),test.lastIndexOf("12"));
				System.out.println(test);
				cout+=2;
		}
       return cout;
	}

}
