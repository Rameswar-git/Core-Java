package com.tst.program2;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class tt {

	public static void main(String[] args) {
		
		 String date = new SimpleDateFormat("hh:mm a").format(new Date());
		 
		 System.out.println(date);
		 
		 
		 BigDecimal bd=new BigDecimal(5);
		 
		 if(!bd.equals(new BigDecimal(2))){
			 System.out.println("ram");
		 }

	}

}
