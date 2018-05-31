package CompleteInterview;

public class AdjecentDuplicateRemove {

	public static void main(String[] args) {
		String txt="ABBBCCD";
		StringBuilder build=new StringBuilder(" ");
		for (int i = 0; i < txt.length() ; i++) {
			if(!(build.toString().charAt(build.toString().length()-1) == txt.charAt(i))) {
				build.append(txt.charAt(i)+"");
			}
		}
		System.out.println(build.toString().trim());	
	}

}
