package demo1;

class A {
	synchronized void funA(B b) {
		String name = Thread.currentThread().getName();

		System.out.println(name + " ����A.f00");

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

		System.out.println(name + " ����B.f00");

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

		Thread.currentThread().setName("���߳� -->> ");
		new Thread(this).start();
		a.funA(b);

		
	}

	public void run() {
		Thread.currentThread().setName("���߳� -->> ");

		b.funB(a);
	}

	public static void main(String[] args) {
		new DeadLockDemo();
	}

}
