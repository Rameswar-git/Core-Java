package CompleteInterview.oops.overriding;

public class InstanceVaribleinOverride {

	static class Super {
		int i = 90;

		Super() {
			//this constructor should must be defined in this case else compile error 
		}

		Super(String s) {
			this.i = 10;
		}
	}

	static class Sub extends Super {
		Sub(String s) {
			System.out.println(i);
			super.i = 20;
		}

		public static void main(String[] args) {
			Super b = new Super("hello");
			Sub s = new Sub("hello");
			System.out.println(b.i);
			System.out.println(s.i);
		}

	}

}
