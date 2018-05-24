package com.liange.chapter5;

public class Pattern4 {

	public static void main(String[] args) {
        int norow=8;
     for (int i = 1; i <= norow; i++) {
    	 for(int k=norow-i;k>0;k--){
    		 System.out.print("    ");
    	 }
    	 if(i == 1){
    		 System.out.print("   "+1);
    	 }else {
    		 int count=1;
//    		 int norep=1;
			for(int m=0;m<i;m++){
//				System.out.print(count+" ");
				System.out.printf("%4d", (count));
				count=count+count;
			}
			count=count/2;
           while(count/2 >0){
        	   System.out.printf("%4d", (count/2));	
        	   count=count/2;
           }

		}
		System.out.println();
	   }    
        
	}

}
