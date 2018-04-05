package com.test.programs;


public class Test {

	public static void main(String[] args) throws Exception {  
		
        
      
            double tst=5.50;
            
            if ((tst == Math.floor(tst)) && !Double.isInfinite(tst)) {
                // integer type
            	
            }
            
            System.out.println(Math.ceil(tst));
    }  
}  


//Consumer consumer = new ConsumerImpl(10);  
//
//FileReader fr=new FileReader("D:\\testout.txt");
//
//BufferedReader br = new BufferedReader(fr); 
//
//String line = "";  
//
//while((line = br.readLine()) != null){  
// System.out.println("Producer producing: " + line);  
// consumer.consume(new PrintJob(line));  
//}  
//
//consumer.finishConsumption();  