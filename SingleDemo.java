package demo2;

class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

	public void print() {
		System.out.println("hello world! ");
	}
}

public class SingleDemo {
	public static void main(String[] args) {
		
		
		Singleton.getInstance().print();
		
		Singleton s2 =  Singleton.getInstance();
		
		Singleton s3 =  Singleton.getInstance();
		
		
		s2.print();
		s3.print();
		
	}
}
