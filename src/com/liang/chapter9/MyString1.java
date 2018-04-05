package com.liang.chapter9;

import java.util.Arrays;

public class MyString1 {
	private char[] chars;

	public MyString1(char[] cha) {
		this.chars = cha;
	}

	public char charAt(int index) {
		return chars[index];
	}

	public int length() {
		return chars.length;
	}
	
	public MyString1 substring(int begin,int end) {
		char[] ch=new char[end-begin];
		for (int i = begin,j=0; i < end; j++ , i++) {
			ch[j]=chars[i];
		}
		
		return new MyString1(ch);
		
	}
	
	public MyString1 toLowerCase(MyString1 str) {
		char[] lowstr=new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if (str.chars[i] >= 'A' && str.chars[i] <= 'Z') {
				lowstr[i]=(char) (str.chars[i]+32);
			}else{
				lowstr[i]=str.chars[i];
			}
		}
		return new MyString1(lowstr);
	}
	
	public boolean equals(MyString1 str) {
		if(chars.length != str.chars.length)
			return false;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != str.chars[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static MyString1 valueOf(int i){
		int no=i;
		int length=0;
		while(no>0){
			no=no/10;
			length++;
		}
	 char[] sum=new char[length];	
	 
	 for (int j = 0; j< sum.length; j++) {
		 sum[j]=Character.forDigit((i/10), 10);
		 i=i/10;
	}
		return new MyString1(sum);
	}
	
}
