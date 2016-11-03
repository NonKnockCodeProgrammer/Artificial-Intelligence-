package demo1;

class P {
	synchronized void funA(T t) {
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

class T {
	synchronized void funB(P p) {

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

public class Test implements Runnable {

	P p = new P();
	T t = new T();

	Test() {
		Thread.currentThread().setName("���߳�-->>");// ���߳�

		p.funA(t);

		new Thread(this).start();
	}

	public void run() {

		Thread.currentThread().setName("���߳� -->> ");

		t.funB(p);
	}

	public static void main(String[] args) {
		new Test();
	}
}
