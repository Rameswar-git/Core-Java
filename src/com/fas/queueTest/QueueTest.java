package com.fas.queueTest;

import java.util.HashSet;
import java.util.Set;

public class QueueTest {

	public static void main(String[] args) {
		Employee e1=new Employee("rameswar", "Das");
		Employee e2=new Employee("Hari", "L");
		Employee e3=new Employee("Lokesh", "F");
		
		System.out.println(e1.hashCode()+"  "+e2.hashCode()+"  "+e3.hashCode());
//	   Set<Employee> alList=new HashSet<>();
//	   alList.add(e2);
//	   alList.add(e1);
//	   alList.add(e3);
//	   System.out.println("**********ArrayList*********");
//	   alList.forEach(System.out::println);
//	   System.out.println("**********ArrayList*********");
//	   GenQueue<Employee> qlist=new GenQueue<Employee>();
//	   
//	   qlist.enque(e2);
//	   qlist.enque(e1);
//	   qlist.enque(e3);
//	   System.out.println("**********Queue*********");
//	   while(qlist.hasmore()){
//		   System.out.println(qlist.deque());
//	   }
//	   System.out.println("**********Queue*********");
	    
	}
}
