package demo1;

class A {
	synchronized void funA(B b) {
		String name = Thread.currentThread().getName();

		System.out.println(name + " 进入A.f00");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		for (int i = 1; i < 11; i++) {
			System.out.println(name + " " + i);
		}
	}
}

class B {
	synchronized void funB(A a) {
		String name = Thread.currentThread().getName();

		System.out.println(name + " 进入B.f00");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		for (int i = 1; i < 11; i++) {
			System.out.println(name + " " + i);
		}
	}
}

public class DeadLockDemo implements Runnable {

	A a = new A();
	B b = new B();

	DeadLockDemo() {

		Thread.currentThread().setName("主线程 -->> ");
		new Thread(this).start();
		a.funA(b);

		
	}

	public void run() {
		Thread.currentThread().setName("子线程 -->> ");

		b.funB(a);
	}

	public static void main(String[] args) {
		new DeadLockDemo();
	}

}
