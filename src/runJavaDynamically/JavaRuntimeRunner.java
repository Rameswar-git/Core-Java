package runJavaDynamically;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

public class JavaRuntimeRunner {
	  public static void main(String[] args)throws Exception {
	      File sourceFile = new File("generated/Hello.java");
	      FileWriter writer = new FileWriter(sourceFile);
	      writer.write("public class Hello{ \n" + " public void doit() { \n"
	          + "   System.out.println(\"Hello world\") ;\n" + " }\n" + "}");
	      writer.close();

	      JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
	      StandardJavaFileManager fileManager = compiler.getStandardFileManager(
	          null, null, null);

	      fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays
	          .asList(new File("generated/")));
	      // Compile the file
	      boolean success = compiler.getTask(null, fileManager, null, null, null,
	          fileManager.getJavaFileObjectsFromFiles(Arrays.asList(sourceFile)))
	          .call();
	      fileManager.close();
	      runIt();
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
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
}
