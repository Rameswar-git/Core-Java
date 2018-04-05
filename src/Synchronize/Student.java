package Synchronize;

import java.util.HashSet;
import java.util.Set;

public class Student {
	
	private String name;
	private Set<String> book;	
	
	public void addbook(String Book){
		if(book == null){
			this.book=new HashSet<>();
			
		}
		this.book.add(Book);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBook() {
		return book;
	}

	public void setBook(Set<String> book) {
		this.book = book;
	}

}
