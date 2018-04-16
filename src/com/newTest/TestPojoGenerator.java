/*package com.newTest;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class TestPojoGenerator {
	
	public static void main(String[] args) throws Exception {

		Map<String, Class<?>> props = new HashMap<String, Class<?>>();
		props.put("foo", Integer.class);
		props.put("bar", String.class);

		Class<?> clazz = PojoGenerator.generate(
				"net.javaforge.blog.javassist.Pojo$Generated", props);

		Object obj = clazz.newInstance();

		System.out.println("Clazz: " + clazz);
		System.out.println("Object: " + obj);
		System.out.println("Serializable? " + (obj instanceof Serializable));

		for (final Method method : clazz.getDeclaredMethods()) {
			System.out.println(method);
		}

		// set property "bar"
		clazz.getMethod("setBar", String.class).invoke(obj, "Hello World!");

		// get property "bar"
		String result = (String) clazz.getMethod("getBar").invoke(obj);
		System.out.println("Value for bar: " + result);

	}

}
*/