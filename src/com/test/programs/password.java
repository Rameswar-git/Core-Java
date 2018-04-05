package com.test.programs;

public class password {

	public static void main(String[] args) {

		String password="12";
		System.out.println(password.equals(password.toLowerCase()));
		boolean hasUppercase = !password.equals(password.toLowerCase());
		boolean hasLowercase = !password.equals(password.toUpperCase());
		
		if(hasUppercase || hasLowercase){
			System.out.println("SUCCESS");
		}else{
			System.out.println("FAIL");
		}
		
	}

}
