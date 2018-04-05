package com.liang.chpter11;

public class Employee extends Person {
	String office;
	double salary;
	MyDate date;

	public Employee(String name, String address, int number, String mail, String off, double sal) {
		super(name, address, number, mail);
		this.office = off;
		this.salary = sal;
		this.date = new MyDate();

	}

	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + ", date=" + date + ", name=" + name + ", address="
				+ address + ", number=" + number + ", mail=" + mail + "]";
	}

}
