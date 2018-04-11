package com.arralisteaxmple;

import java.util.LinkedList;



public class arraylisttest {
	

	public static void main(String[] args) {
		

	
		LinkedList<String> polno=new LinkedList<String>();
        polno.add("VPC1886545000100");
        polno.add("VPC1886546000100");
        polno.add("VPC1886547000100");
        polno.add("VPC1886548000100");
        polno.add("VPC1886549000100");
        polno.add("VPC1886550000100");       
        polno.add("VPC1886551000100");
        polno.add("VPC1886552000100");
        polno.add("VPC1886553000100");
        polno.add("VPC1886554000100");
        polno.add("VPC1886555000100");
        polno.add("VPC1886556000100");
        polno.add("VPC1886557000100");
        polno.add("VPC1886558000100");
        polno.add("VPC1886559000100");       
        polno.add("VPC1886560000100");
        polno.add("VPC1886561000100");
        polno.add("VPC1886562000100");
        polno.add("VPC1886563000100");
        polno.add("VPC1886564000100");
        polno.add("VPC1886565000100");
       
        while(!(polno.size() == 0)){
            if (polno.size()<=10) {        	
                for(int i=polno.size();i>0;i--){
                	System.out.println(polno.get(i-1));
                	polno.remove(i-1);          	
                }
    			
    		}else{
    			
    	        for(int i=10;i>=0;i--){
    	        	System.out.println(polno.get(i));
    	        	polno.remove(i);	        	
    	        }
    		}
        }            
	}
	
	public void name() {
		
	}
	static String j="hgv";

}
