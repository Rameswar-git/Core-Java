package ThisTest;

public class Motorcycle extends Vehicle{

	@Override
	public String engine() {
		
		System.out.println(" Motor Cycle Engine ");
		
		System.out.println( super.engine());
		
		return super.engine();
	}
	
	

}
