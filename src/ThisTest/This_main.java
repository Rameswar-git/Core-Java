package ThisTest;

public class This_main {

	public static void main(String[] args) {
		This_Test th=new This_Test("rameswar",10);
        System.out.println(th.hashCode());
        System.out.println(th.method().hashCode());
        System.out.println(th.name);
        System.out.println(th.value);
	}


}
