package ThisTest;

public class ThisClassTest {
	
	boolean item2flag=false;
	
	public void tets1(int item2) {
		if(item2>=10){
			item2flag=true;
		}		
	}
	
	public void tets2() {
		System.out.println(this.item2flag);
	}

}
