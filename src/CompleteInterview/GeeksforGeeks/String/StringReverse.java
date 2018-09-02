package CompleteInterview.GeeksforGeeks.String;

import java.util.stream.IntStream;

public class StringReverse {

	public static void main(String[] args) {
		String name = "i.like.this.program.very.much";

		StringBuilder build = new StringBuilder();
		//
		// int itrcount=name.split("[.]").length;
		//
		//
		// for (int i = 0; i < itrcount ; i++) {
		//
		// if(name.lastIndexOf(".") > 0) {
		// build.append(name.substring(name.lastIndexOf("."), name.length())) ;
		// name=name.substring(0, name.lastIndexOf("."));
		// }else {
		// build.append("."+name.substring(0, name.length())) ;
		// }
		//
		//
		// }

		char[] charcters = name.toCharArray();
		
		IntStream.range(0, charcters.length).forEach(t -> build.append(charcters[charcters.length-t-1]));

		System.out.println(build.toString());

	}

}
