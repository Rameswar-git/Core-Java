package com.liang.chpter11;

public class InheritanceTest {

	public static void main(String[] args) {
		Person pe=new Person("Rameswar","Chennai",123,"Ram@email");
		Student student=new Student("Rameswar","Chennai",123,"Ram@email", Status.FRESHMAN);
		Employee employee=new Employee("Rameswar","Chennai",123,"Ram@email","Paris",15000);
		Faculty fac=new Faculty("Rameswar","Chennai",123,"Ram@email","Paris",15000,"9",5);
		Staff stf=new Staff("Rameswar","Chennai",123,"Ram@email","Paris",15000,
				"Mr");
    
		System.out.println(pe);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(fac);
		System.out.println(stf);
		
		
	}

}
