package Usefulprograms;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class MacOsTerminalCommandRunner {

//    public static void main(String[] args) throws IOException, InterruptedException {
//
//        String command = "ping -c 3 www.google.com";
//
//        Process proc = Runtime.getRuntime().exec(command);
//
//        // Read the output
//
//        BufferedReader reader =  
//              new BufferedReader(new InputStreamReader(proc.getInputStream()));
//
//        String line = "";
//        while((line = reader.readLine()) != null) {
//            System.out.print(line + "\n");
//        }
//        
//
//        proc.waitFor();   
//
//    }
	
//	ProcessBuilder pb = new ProcessBuilder("command", "argument");
//	pb.directory(new File(<directory from where you want to run the command>));
	
//	public static void main(String[] args) throws IOException, InterruptedException {
//		ProcessBuilder builder = new ProcessBuilder("/bin/bash -c ");
//		builder = builder.directory(new File("/Users/C5323492") );
////		builder.command(args)
////		builder =builder.directory(new File("Users/C5323492/SAPDevelop/AN/src/git/AN/microservices/testing/mrptesting"));
////		builder.command("cd");
//		builder.command("mvn");
////		Process proc = Runtime.getRuntime().exec("mvn");
//		Process ps= builder.start();
//        BufferedReader r = new BufferedReader(new InputStreamReader(ps.getInputStream()));
//        String line;
//        while (true) {
//            line = r.readLine();
//            if (line == null) { break; }
//            System.out.println(line);
//        }
//        
//        System.out.println(ps.waitFor());
//	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		new LinkedList<>();
		String[] cmdline = {"/bin/zsh", "-ic"  , "/usr/local/Cellar/maven/3.8.1/libexec/mvn","clean","install" , "-o"};
		ProcessBuilder builder = new ProcessBuilder(cmdline);
		
		builder =builder.directory(new File("/Users/C5323492/SAPDevelop/AN/src/git/AN/microservices/testing/mrptesting"));
//		builder.command("/usr/local/Cellar/maven/3.8.1/libexec/mvn");
//		builder.command("install -o");
//		builder.command("mvn-ci");
		
		Process ps = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(ps.getInputStream()));
        String line;
      while (true) {
          line = r.readLine();
          if (line == null) { break; }
          System.out.println(line);
      }
      
      System.out.println(ps.waitFor());
	}
	
 

}
