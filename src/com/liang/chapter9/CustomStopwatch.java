package com.liang.chapter9;

public class CustomStopwatch {
      private long StartTime;
      private long EndTime;
	public CustomStopwatch() {
		this.StartTime=System.currentTimeMillis();
	}
      
    public void start(){
    	this.StartTime=System.currentTimeMillis();
    }
    
    public void Stop() {
    	 this.EndTime=System.currentTimeMillis();
  	}
    public long getElapsedTime() {
    	return this.EndTime-StartTime;
    }
    
	
}
