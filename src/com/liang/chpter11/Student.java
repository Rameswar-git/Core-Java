package com.liang.chpter11;

public class Student extends Person {
	Status st;
	
    public Student(String name, String address, int number, String mail,Status sta) {
		super(name, address, number, mail);
		st=sta;
	}
	@Override
	public String toString() {
		return "Student [st=" + st + ", name=" + name + ", address=" + address + ", number=" + number + ", mail=" + mail
				+ "]";
	}
}
