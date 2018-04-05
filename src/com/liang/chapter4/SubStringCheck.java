package com.liang.chapter4;

import java.util.Scanner;

public class SubStringCheck {

	public static void main(String[] args) {
		System.out.println("Enter The String To chec k the substring::");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter second String to ::");
		String str2 = sc.nextLine();
         boolean name=true;
         
		for (int i = 0; i < str.length(); i++) {
           for (int j = i+1; j < str.length() ; j++) {
			 if (str.substring(i, j).equals(str2)) {
				 name=false;
				System.out.println(str2+ " is a substring of "+str);
				break;
			}
		   }
		}
		if(name)
		System.out.println(str2+" is not a substring of "+str);
	}

}


//if (str.substring(i).equals(str2)) {
//    
//	System.out.println(str2+" is a sub String of "+str);
//	
//}