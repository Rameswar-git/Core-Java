package Commonslang.String;

	
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

public class StringNullcheck {

	public static <T> void main(String[] args) {
//		StringUtils.isNotBlank(cs)
		
		String name1= null;
		String name2="Ram";
		
		
//		System.out.println(TestNull(name1));
//		System.out.println(TestNull(name2));
		
		String test=StringUtils.trimToNull("  a  b ");
		String test2=StringUtils.trimToEmpty("  a  b ");
		
		String name=StringUtils.defaultIfBlank("dccv", "T");
		
           System.err.println(name);		
           
		
	}

	private static  boolean TestNull(String name1) {
           return StringUtils.isNotBlank(name1);
	}
	
	

}
