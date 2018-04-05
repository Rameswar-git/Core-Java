package Synchronize;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestExample2 {

	public static void main(String[] args) {
		
		Student obj1=new Student();
		
		obj1.setName("Rameswar");
        obj1.addbook("Java 8 in Action");
        obj1.addbook("Spring Boot in Action");
        obj1.addbook("Effective Java (2nd Edition)");
        
        Student obj2=new Student();
        obj2.setName("zilap");
        obj2.addbook("Learning Python, 5th Edition");
        obj2.addbook("Effective Java (2nd Edition)");
        
        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        
        List<String> booknames=list.stream().map(x->x.getBook()).flatMap(x->x.stream()).distinct().collect(Collectors.toList());
        
        System.out.println(booknames);

	}

}
