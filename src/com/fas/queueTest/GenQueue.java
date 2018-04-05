package com.fas.queueTest;

import java.util.LinkedList;

public class GenQueue<E> {
	private LinkedList<E> list=new LinkedList<>();
	
	public void enque(E item){
		list.addLast(item);
	}
	
	public boolean hasmore(){
		return !list.isEmpty();
	}
	
	public int size(){
		return list.size();
	}
	
	
	public E deque(){
		return list.poll();
	}

}
