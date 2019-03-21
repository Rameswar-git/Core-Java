package CompleteInterview.Strings;

public class FirstLetterUppercase {

	public static void main(String[] args) {
       String name="rameswar";
       StringBuilder bld=new StringBuilder(name);
       
       StringBuilder delete = bld.delete(0, 1).insert(0, Character.toUpperCase(name.charAt(0)));
       
       System.out.println(delete.toString());

       
       
	}

}
