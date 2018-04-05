package com.liang.chapter9;

public class Timetest {

	public static void main(String[] args) {
         Time time=new Time();
         Time time2=new Time(555550000);
         
         
         System.out.println(time.getHour()+"::"+time.getMinutes()+"::"+time.getSeconds());
         System.out.println(time2.getHour()+"::"+time2.getMinutes()+"::"+time2.getSeconds());
         
	}

}
