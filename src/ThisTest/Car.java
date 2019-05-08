package ThisTest;

public class Car extends Vehicle {

	@Override
	public String engine() {
		System.out.println(" Car Engine ");
		System.out.println(super.engine());
		return super.engine();
	}
}
