package com.liang.chapter9;

import java.util.Calendar;
import java.util.Date;

public class Time {
	private int hour;
	private int minutes;
	private long seconds;

	public Time() {
		this.hour = Calendar.HOUR;
		this.minutes = Calendar.MINUTE;
		this.seconds = Calendar.SECOND;
	}

	public Time(long elapsedtime) {
        Date date=new Date(elapsedtime);	
		this.hour = date.getHours();
		this.minutes = date.getMinutes();
		this.seconds = date.getSeconds();
	}

	public Time(int hour, int minutes, long seconds) {
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public long getSeconds() {
		return seconds;
	}
	
	public void setElapsedTime(long elapsedtime) {
        Date date=new Date(elapsedtime);	
		this.hour = date.getHours();
		this.minutes = date.getMinutes();
		this.seconds = date.getSeconds();
	}
	
}
