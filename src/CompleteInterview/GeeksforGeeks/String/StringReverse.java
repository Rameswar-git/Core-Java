package CompleteInterview.GeeksforGeeks.String;


public class StringReverse {
	

	public static void main(String[] args) {
		 String name="i.like.this.program.very.much";
		 
		 
		 StringBuilder build=new StringBuilder();
		 
		 int itrcount=name.split("[.]").length;

		 
		 for (int i = 0; i <  itrcount ; i++) {
			 
			 if(name.lastIndexOf(".") > 0) {
				 build.append(name.substring(name.lastIndexOf("."), name.length())) ;
				 name=name.substring(0, name.lastIndexOf("."));
			 }else {
				 build.append("."+name.substring(0, name.length())) ;
			 }

			
		}

           
           System.out.println(build.toString());
		
		

	}


}
