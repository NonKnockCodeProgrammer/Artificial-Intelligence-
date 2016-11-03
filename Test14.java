package test;

interface AA {
	public void run();
}

class BB implements AA {

	@Override
	public void run() {
		System.out.println("sssss");
	}
}

class CC implements AA {
	private AA a;
	
	public CC(AA a){
		this.a = a;
	}
	public void fun() {
		System.out.println("000000 ");
	}

	@Override
	public void run() {
		this.fun();
		this.a.run();
	}
}

public class Test14 {
	public static void main(String[] args) {
		AA a = null;
		a = new CC(new BB());
		a.run();
	
	}
}
