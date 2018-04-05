package com.singleton.test;

import java.io.ObjectStreamException;
import java.io.Serializable;

import javax.management.InstanceAlreadyExistsException;

public class FullySingleton  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static FullySingleton obj=null;
	
	private FullySingleton() throws InstanceAlreadyExistsException{
		if(null!=obj){
			System.out.println("Object ALready Exists Exception");
			throw new InstanceAlreadyExistsException();			
		}
	}
	
	public static  FullySingleton getInstance() throws InstanceAlreadyExistsException{
		if(obj==null){
            synchronized (FullySingleton.class) {
                if(obj == null){
                    obj = new FullySingleton();
                     }
                 } 
		     }
	
	   return obj;
	}
	
	@Override
	protected FullySingleton clone() throws CloneNotSupportedException{
		try {
			return FullySingleton.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
//	private Object readresolve()  throws ObjectStreamException, InstanceAlreadyExistsException {
//		return FullySingleton.getInstance();
//	}
	
}
