package com.singleton.test;

import java.io.Serializable;

import javax.management.InstanceAlreadyExistsException;

public class CompleteSingleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3191827158036135607L;
	
	private static CompleteSingleton obj=null;
	
	
	private CompleteSingleton() throws InstanceAlreadyExistsException{
		if (null!=obj) {
			throw new InstanceAlreadyExistsException();
		}
	}
	
	public static CompleteSingleton getInstance() throws InstanceAlreadyExistsException{
		if (obj == null) {
			synchronized (CompleteSingleton.class) {
				if(obj == null){
					obj=new CompleteSingleton();
					return obj;
				}
			}
		}
			return obj;
			
	}
	
	@Override
	protected CompleteSingleton clone(){
		try {
			return CompleteSingleton.getInstance();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return obj;
	
	}

}
