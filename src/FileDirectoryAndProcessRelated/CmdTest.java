package FileDirectoryAndProcessRelated;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CmdTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
//		Runtime run = Runtime.getRuntime();
		
//		Process p = null; 
		
//		  p = run.exec("cmd.exe /c  C:\\Users\\fasupport\\Downloads\\Compressed\\tst.bat");
		
//		String path="C:\\Users\\fasupport\\Downloads\\Compressed";
//       ProcessBuilder builder = new ProcessBuilder("cmd.exe" ,"/C","E: && cd " +path+" && jboss-cli.bat --connect command=:reload");
		
		String path="C:\\Users\\fasupport\\Downloads\\Compressed\\ && tst.bat";
       
       ProcessBuilder builder = new ProcessBuilder("cmd.exe","/c", "C: && cd "+path);
       
//       builder.command("connect","shutdown");

		
                
    		   //"cd \\C:\\Users\\fasupport\\Downloads\\Compressed\" && dir");
		
//		String[] strings={"--connect command=:shutdown"};   && tst.bat
		
//		String[] strings={"set path=C:\\Program Files\\Java\\jdk1.8.0_111\\bin;"};
		
//		Process p =  Runtime.getRuntime().exec("cmd /c jboss-cli.bat", strings ,
//				new File("E:\\wildfly-10.1.0.Final\\bin"));
		
//		int val=p.exitValue();
		
		

		
//		System.out.println(val); "set JAVA=<C:\\Program Files\\Java\\jdk1.8.0_111\\bin>",
		
//       builder.command(command)
            builder.redirectErrorStream(true);
            Process p = builder.start();
            

       
          
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while (true) {
                line = r.readLine();
                if (line == null) { break; }
                System.out.println(line);
            }

		//E:\\wildfly-10.1.0.Final\\bin  jboss-cli.bat  tst.bat
//		String[] command = {"connect","shutdown"};
//		ProcessBuilder builder = new ProcessBuilder(command);
//		builder.directory(new File("E:\\wildfly-10.1.0.Final\\bin\\jboss-cli.bat"));
//		 builder.start();
		
		
	}

}
