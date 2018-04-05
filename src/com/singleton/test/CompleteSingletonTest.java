package com.singleton.test;

import javax.management.InstanceAlreadyExistsException;

public class CompleteSingletonTest {

	public static void main(String[] args) throws InstanceAlreadyExistsException {
		CompleteSingleton obj=CompleteSingleton.getInstance();
		CompleteSingleton obj2=obj.clone();
		
		if (obj2.hashCode() == obj.hashCode()) {
			System.out.println("Same");
		}
	}

}
