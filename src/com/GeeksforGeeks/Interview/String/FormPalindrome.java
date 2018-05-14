package com.GeeksforGeeks.Interview.String;

public class FormPalindrome {

	public static void main(String[] args) {
		
		String name="abcd";
		
		String req="";
		
		StringBuffer buf=new StringBuffer(name).reverse();
		
	if(buf.toString().equals(name)) {
		System.out.println(" The No of Characters required to the string palindrome is 0 ");
	 }else {
		 req=name.substring(1,name.length());
		 name=new StringBuffer(name.substring(1,name.length())).reverse()+name;
		 StringBuffer buf2=new StringBuffer(name).reverse();
		 if(buf2.toString().toString().equals(name)) {
			 System.out.println(" Required No Of characters to make the string palinfrome is "+req+" length is "+req.length());
		 }
	 }
	

	}

}
