package ThisTest;

public class MethodOverloading {

	public static void main(String[] args) {
		
		float a=10.5f;
		float b=6;
		
		System.out.println(sum(a, b));
	}
	
	public static int sum(int a ,int b) {
		System.out.println("Integer");
		return a+b;
	}
	public static Double sum(Double a ,Double b) {
		System.out.println("Double");
		return a+b;
	}
	public static Float sum(Float a ,Float b) {
		System.out.println("Float");
		return a+b;
	}


}
