package com.liang.chapter19.Ex_19_1;

import java.util.ArrayList;
import java.util.List;

public class GeneraicArrayList<E> {
 
	 List<E> lst=new ArrayList<>();
	 
	 public int getSize() {
		 return lst.size();
	 }
	 
	 public E Peek() {
		 return lst.get(getSize() - 1);
	 }
	 
      public void push(E o) {
    	  lst.add(o);
      }
      
      public E pop() {
    	  E o=lst.get(getSize() - 1);
    	  lst.remove(o);
    	  return o;
      }

	@Override
	public String toString() {
		return lst.toString();
	}
      


}
