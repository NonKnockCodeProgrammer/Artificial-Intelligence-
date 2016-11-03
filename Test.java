package demo1;

class P {
	synchronized void funA(T t) {
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

class T {
	synchronized void funB(P p) {

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

public class Test implements Runnable {

	P p = new P();
	T t = new T();

	Test() {
		Thread.currentThread().setName("主线程-->>");// 主线程

		p.funA(t);

		new Thread(this).start();
	}

	public void run() {

		Thread.currentThread().setName("子线程 -->> ");

		t.funB(p);
	}

	public static void main(String[] args) {
		new Test();
	}
}
