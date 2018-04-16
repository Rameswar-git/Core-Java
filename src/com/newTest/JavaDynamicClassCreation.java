package com.newTest;

import sun.misc.Unsafe;

import javax.tools.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;

import static java.util.Collections.singletonList;
import static javax.tools.JavaFileObject.Kind.SOURCE;
/**
 * by Rob Austin
 * date Feb 1013
 */
public class JavaDynamicClassCreation {

    public void dynamicClassCreation() throws ClassNotFoundException, IllegalAccessException, URISyntaxException, NoSuchFieldException {

        final String className = "HelloWorld";
        final String path = "com.bounded.buffer";
        final String fullClassName = path.replace('.', '/') + "/" + className;

        final StringBuilder source = new StringBuilder();
        source.append("package " + path + ";");
        source.append("public class " + className + " {\n");
        source.append(" public String toString() {\n");
        source.append("     return \"HelloWorld - Java Dynamic Class Creation was written by Rob Austin\";");
        source.append(" }\n");
        source.append("}\n");

        // A byte array output stream containing the bytes that would be written to the .class file
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        final SimpleJavaFileObject simpleJavaFileObject
                = new SimpleJavaFileObject(URI.create(fullClassName + ".java"), SOURCE) {

            @Override
            public CharSequence getCharContent(boolean ignoreEncodingErrors) {
                return source;
            }

            @Override
            public OutputStream openOutputStream() throws IOException {
                return byteArrayOutputStream;
            }
        };

        final JavaFileManager javaFileManager = new ForwardingJavaFileManager(
                ToolProvider.getSystemJavaCompiler().getStandardFileManager(null, null, null)) {

            @Override
            public JavaFileObject getJavaFileForOutput(Location location,
                                                       String className,
                                                       JavaFileObject.Kind kind,
                                                       FileObject sibling) throws IOException {
                return simpleJavaFileObject;
            }
        };

        ToolProvider.getSystemJavaCompiler().getTask(
                null, javaFileManager, null, null, null, singletonList(simpleJavaFileObject)).call();

        final byte[] bytes = byteArrayOutputStream.toByteArray();

        // use the unsafe class to load in the class bytes
        final Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        final Unsafe unsafe = (Unsafe) f.get(null);
        final Class aClass = unsafe.defineClass(fullClassName, bytes, 0, bytes.length, null, null);

        Object o;
		try {
			o = aClass.newInstance();
		    System.out.println(o);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      

    }

    public static  void main(String[] args) throws ClassNotFoundException, URISyntaxException, NoSuchFieldException, IllegalAccessException {
        new JavaDynamicClassCreation().dynamicClassCreation();
    }

}
