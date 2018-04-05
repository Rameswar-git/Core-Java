package com.practice;

import java.io.Serializable;

import javax.management.InstanceAlreadyExistsException;


public class Singletonclass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2320136543373835036L;
	
	private static Singletonclass obj=null;
	
	private Singletonclass() throws InstanceAlreadyExistsException{
		if (null!=obj) {
			throw new InstanceAlreadyExistsException();
		}
	}
	
	public static Singletonclass getInstance() throws InstanceAlreadyExistsException{
		if (obj == null) {
			synchronized (Singletonclass.class) {
				if (obj == null) {
					obj=new Singletonclass();
					return obj; 
				}
			}
		}
		return obj;
	}
	
	@Override
	protected Singletonclass clone(){
		try {
			return Singletonclass.getInstance();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return obj;
	
	}


}
