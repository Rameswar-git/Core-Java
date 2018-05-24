package CompleteInterview.Generics;


public class JavaGenericMethod {

	public static void main(String[] args) {
		
		int a=10;
		
		int b=8;	
		
		int c=90;
		
		System.out.println(sum1(a,b));
		
		System.out.println(sum2(a,c));
		

	}

//	private static <T extends Number> T sum1(List<? extends Number > a, List<? extends Number> b) {
//		
//		return null;
//	}
	
	private static <T extends Number> double sum1(T a, T b) {
		
		return a.doubleValue()+b.doubleValue();
	}
	
	
	private static <T extends Number , E extends Integer> double  sum2(T  a, E  b) {
		
		return a.doubleValue()+b.doubleValue();
	}


}
