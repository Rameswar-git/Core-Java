package CompleteInterview.oops.Inheritance;

/*
 * This Example demonstrates java 8 Multiple Inheritance 
 */

interface One {
	default public String getName() {
		return "One";
	}
	
	static void printInfo() {
		System.out.println("Interface One");
	}
}

interface Two {
	default public String getName() {
		return "Two";
	}
}

public class Java8MultipleInheritance implements One,Two{

	public static void main(String[] args) {
		One.printInfo();
		System.out.println(new Java8MultipleInheritance().getName());
	}

	@Override
	public String getName() {
		return One.super.getName();
	}

}
