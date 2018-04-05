package com.test.programs;

public class PrintJob implements Item{
	
    private String line;  

    public PrintJob(String s){  
     line = s;  
    }  

    public void process(){  
     System.out.println(Thread.currentThread().getName()+"consuming :" + line);  
    }  
	

}
