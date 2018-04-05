package com.liang.chpter11;

public class Staff extends Employee {
	
   String title;

public Staff(java.lang.String name, java.lang.String address, int number, java.lang.String mail, java.lang.String off,
		double sal, java.lang.String tit) {
	super(name, address, number, mail, off, sal);
	title = tit;
}

@Override
public String toString() {
	return "Staff [title=" + title + ", office=" + office + ", salary=" + salary + ", date=" + date + ", name=" + name
			+ ", address=" + address + ", number=" + number + ", mail=" + mail + "]";
}
   
   
}
