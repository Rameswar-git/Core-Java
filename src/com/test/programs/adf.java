package com.test.programs;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Calendar;


public class adf {
	


	public static void main(String[] args) throws ParseException {
		
		DecimalFormat dff = new DecimalFormat("############.##");
//		
//		
//		String df=new String("-104.761500");
		
//		double bd=308.0937;
		
//		BigDecimal bd =new BigDecimal("0.13000000000010914");
		
//		String d="12171.62";
		
//		String s="0.13500000000021828";
		
//		double total=1500;
//		
//		total+=Double.parseDouble(dff.format(Double.valueOf("-0.89")));
//		
//		System.out.println(Math.round(1619.68));
		
//		System.out.println(total);
		
//System.out.println(Math.round(1619.88)-1619.88);
//		double round1 = Double.parseDouble(dff.format((0.18)*(-1)));
//		
//		System.out.println(round1);
		
//		Long ts=new Long(58);
		
//		if(ts!=null){
//			System.out.println(ts);
//		}
//		
//		String df1=dff.format(df);
		
//		String ts=bd.toPlainString();
//		
//        String[] ram=ts.split("\\.");   
        
//        double sr = Math.round(bd);
		
//        System.out.println(sr);
//		
//		System.out.println(Math.round(d)-d);
//		
//		System.out.println(dff.format(bd));
//
//double rnd=Math.round(df);ram.substring(0, ram.indexOf(".")+7)
//
//Double round1 = 
//Double.parseDouble(dff.format((df - rnd)*(-1)));
//  
//System.out.println(round1);
		
//		Date ram=DateUtils.truncate(new Date(), java.util.Date());
//		
//		System.out.println(ram);

		
//		
//		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//
//		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		
		
//	    Date updated_date=new Date(Calendar.getInstance().getTimeInMillis());
//	    Timestamp timestamp = new Timestamp(updated_date.getTime());
//	    updated_date = timestamp;
		
//		Date todayWithZeroTime = formatter.parse(formatter.format(today));
		
//		System.out.println(updated_date);
		
		double d=5000;
		
		BigDecimal bd=new BigDecimal(dff.format(d));
		
		System.out.println(bd);
		

}
}