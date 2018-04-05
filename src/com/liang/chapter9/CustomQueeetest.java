package com.liang.chapter9;

public class CustomQueeetest {

	public static void main(String[] args) {
      Queue q=new Queue();
      
      for (int i = 0; i <= 20; i++) {
		   q.enqueue(i);
	   }
      
     while(!q.isEmpty()){
    	 System.out.println(q.deque()+" ");
     }
     
      
	}

}
