package com.practice;

import javax.management.InstanceAlreadyExistsException;

public class SingletonTest {

	public static void main(String[] args) throws InstanceAlreadyExistsException {
		Singletonclass first=Singletonclass.getInstance();
		Singletonclass second=first.clone();
		if (second.hashCode() == first.hashCode()) {
			System.out.println("same");
		}

	}

}
