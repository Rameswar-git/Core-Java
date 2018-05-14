package com.GeeksforGeeks.Interview.String;

public class AdjecentCharacterRemove {

	public static void main(String[] args) {
		String string = "acaaabbbacdddd";
    
//		StringBuffer sb=new StringBuffer(string);
//		
//		for (int i = sb.length()-2 ; i >=0 ; i--) {
//			if(sb.charAt(i) == sb.charAt(i+1)) {
//				sb.deleteCharAt(i+1);
//			}
//			
//		}
		
		   StringBuilder sb = new StringBuilder();
		    if (string.length() > 0) {
		        char prev = string.charAt(0);
		        sb.append(prev);
		        for (int i = 1; i < string.length(); ++i) {
		            char cur = string.charAt(i);
		            if (cur != prev) {
		                sb.append(cur);
		                prev = cur;
		            }
		        }
		    }
		
		System.out.println(sb.toString());


	}

}
