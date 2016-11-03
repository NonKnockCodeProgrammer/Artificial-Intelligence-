package demo2;

class Outer {

	private String info = "heoll world!!";

	class Inner {
		public void print() {
			System.out.println(info);
		}
	}

}

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.print();
	}
}
