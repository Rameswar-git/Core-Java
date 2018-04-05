package com.tst.program2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateTest {

	public static void main(String[] args) {
		   DateFormat dFormat=new SimpleDateFormat("dd:MMM:YY==>h:mm a");						
		   String batch=dFormat.format(new java.util.Date());
		   System.out.println(batch);

	}

}
