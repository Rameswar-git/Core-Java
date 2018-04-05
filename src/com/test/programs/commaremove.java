package com.test.programs;

public class commaremove {

	public static void main(String[] args) {
		
		String tst= "15,25,17,61,1,29,12,28,22A,10,";
		
		tst = tst.replaceFirst("^,", "");
		tst = tst.replaceAll(",$", "");
		System.out.println(tst);
		
//		String ran="VPC1886077000105";
//		
//		String s=ran.substring(0, 10)+ran.substring(14)+"000";
//		
//		System.out.println(s);
	}

}
