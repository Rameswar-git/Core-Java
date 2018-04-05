package ThisTest;

import java.io.IOException;
import java.io.OutputStream;

public class process {
	public static void main(String[] args) {
//        Runtime run = Runtime.getRuntime();
//        Process p = null; 
//        try {       
//          p = run.exec("cmd.exe");
//          p = run.exec("cmd.exe /c E:\\wildfly-10.1.0.Final\\bin\\jboss-cli.bat /c  shutdown");
//          OutputStream salida = p.getOutputStream();  
          
//           String OUTPUT_FILE = "D:\\EPL-NB-PROPS\\logtestFile.txt";

//           salida.write(OUTPUT_FILE.getBytes());
           
//          System.out.println(salida.toString());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		//E:\\wildfly-10.1.0.Final\\bin\\jboss-cli.bat
		
		
		try {
//            String[] command = {"cmd.exe", "/C", "start","E:\\wildfly-10.1.0.Final\\bin\\jboss-cli.bat"};
//            Process p =  Runtime.getRuntime().exec(command);  
            
           Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start E:\\wildfly-10.1.0.Final\\bin\\jboss-cli.bat","connect--command=:shutdown"});
           
           
//            System.out.println(na);
        } catch (IOException ex) {
        	System.out.println(ex.getMessage());
        }

	}
	}

