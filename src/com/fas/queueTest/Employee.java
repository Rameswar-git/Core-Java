package com.fas.queueTest;

public class Employee {
	private String firstname;
	private  String lastname;
    
	public Employee(String fname,String Lname) {
		this.firstname=fname;
		this.lastname=Lname;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
  
}
