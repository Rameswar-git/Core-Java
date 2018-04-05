package com.tst.program2;

import java.math.BigDecimal;

public class Developer {
	
	String name;
	BigDecimal salary;
	int age;

	 
	public Developer(String nam,BigDecimal sal,int ag){
		this.name=nam;
		this.salary=sal;
		this.age=ag;		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getSalary() {
		return salary;
	}


	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	
}
