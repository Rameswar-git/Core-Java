package ThisTest;

import net.openhft.compiler.CompilerUtils;

public class Tetst {

//	public static void main(String[] args) {
//		
//		String path=System.getProperty("user.dir");
//		System.out.println(path);
//
//	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className = "mypackage.MyClass2";
		 String javaCode = "package mypackage;\n" +
		                  "public class MyClass {\n" +
		                  "    public void run() {\n" +
		                  "        System.out.println(\"Fuck\");\n" +
		                  "    }\n" +
		                  "}\n";
		 Class aClass = CompilerUtils.CACHED_COMPILER.loadFromJava(className, javaCode);
		 Runnable runner = (Runnable) aClass.newInstance();
		 runner.run();
	}

}
