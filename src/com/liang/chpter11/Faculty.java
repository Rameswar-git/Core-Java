package com.liang.chpter11;

public class Faculty extends Employee {

	String officehours;
	int rank;
	public Faculty(String name, String address, int number, String mail, String off, double sal, String officehours,
			int rank) {
		super(name, address, number, mail, off, sal);
		this.officehours = officehours;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Faculty [officehours=" + officehours + ", rank=" + rank + ", office=" + office + ", salary=" + salary
				+ ", date=" + date + ", name=" + name + ", address=" + address + ", number=" + number + ", mail=" + mail
				+ "]";
	}



}
