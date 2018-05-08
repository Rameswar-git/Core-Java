package com.RepeatedStringinsideString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSerachRegex {

	public static void main(String[] args) {

		String Test="sfvkhzgsdvkjfVickykzshDvbjghzvickyk,zshdgfjvhkghsdjrfVickyskdfhjslefsdfvicky";
		
		
		String mat="vicky";
		
		Pattern compile5 = Pattern.compile("vicky");
		
		Matcher matcher = compile5.matcher(Test.toLowerCase());
		
		 while(matcher.find()) {
			 System.out.println(" Vicky Found in index "+matcher.start()+" - "+(matcher.end()-1));
	    }
		 
		 
		 System.out.println(Test);
		
	}

}
