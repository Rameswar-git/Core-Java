package runJavaDynamically;

import net.openhft.compiler.CompilerUtils;

public class JavaRuntimeRunner3 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className = "mypackage.MyClass";
		 String javaCode = "package mypackage;\n" +
		                  "public class MyClass implements Runnable {\n" +
		                  "    public void run() {\n" +
		                  "        System.out.println(\"Hello World\");\n" +
		                  "    }\n" +
		                  "}\n";
		 Class aClass = CompilerUtils.CACHED_COMPILER.loadFromJava(className, javaCode);
		 Runnable runner = (Runnable) aClass.newInstance();
		 runner.run();
	}

}
