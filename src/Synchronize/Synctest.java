package Synchronize;

public class Synctest {

	public static void main(String[] args) {
		MultiplicationTable mul=new MultiplicationTable();
		MyThread1 mt1 = new MyThread1(mul);
		MyThread2 mt2 = new MyThread2(mul);
		
		mt1.setName("Table 4");
		mt2.setName("Table 6");
		
		mt1.start();
		mt2.start();
	}

}
