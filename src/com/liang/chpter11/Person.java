package com.liang.chpter11;

public class Person {
   String name;
   String address;
   int number;
   String mail;
   
public Person(String name, String address, int number, String mail) {
	this.name = name;
	this.address = address;
	this.number = number;
	this.mail = mail;
}

@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + ", number=" + number + ", mail=" + mail + "]";
}
   
   
}
