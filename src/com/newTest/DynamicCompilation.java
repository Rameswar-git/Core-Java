package com.newTest;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

public class DynamicCompilation {

  public static void main(String[] args) throws Exception {
    // create the source
	  
	Scanner scan=new Scanner(System.in);  
	System.out.println("Enter The Class Name :: ");
	  String classname=scan.nextLine();
	  
	  System.setProperty("JAVA_HOME", "C:\\Program Files\\Java\\jdk-10");
	  
	  System.out.println(System.getProperty("JAVA_HOME"));
	  
    File sourceFile   = new File("D:\\CreatedClass\\"+classname+".java");
    FileWriter writer = new FileWriter(sourceFile);
    if(!sourceFile.exists()) {
    	sourceFile.createNewFile();
        writer.write(
                "public class Hello{ \n" +
                " public void doit() { \n" +
                "   System.out.println(\"Hello world\") ;\n" +
                " }\n" +
                "}"
        );
    }
    

    writer.close();
    
    JavaCompiler compiler    = ToolProvider.getSystemJavaCompiler();
    
    StandardJavaFileManager fileManager =
        compiler.getStandardFileManager(null, null, null);

    fileManager.setLocation(StandardLocation.CLASS_OUTPUT,
                            Arrays.asList(new File("/temp")));
    // Compile the file
    compiler.getTask(null,
               fileManager,
               null,
               null,
               null,
               fileManager.getJavaFileObjectsFromFiles(Arrays.asList(sourceFile)))
            .call();
    fileManager.close();


    // delete the source file
    // sourceFile.deleteOnExit();

    runIt();
    
    scan.close();
  }

  @SuppressWarnings("unchecked")
  public static void runIt() {
    try {
      Class params[] = {};
      Object paramsObj[] = {};
      Class thisClass = Class.forName("Hello");
      Object iClass = thisClass.newInstance();
      Method thisMethod = thisClass.getDeclaredMethod("doit", params);
      thisMethod.invoke(iClass, paramsObj);
      }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
