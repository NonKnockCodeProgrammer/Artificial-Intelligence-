package test2;

class ThreadDemo {

	private boolean flag = true;
	private int i = 0;

	public void add() {

		synchronized (this) {
			notify();
			if (this.flag) {
				i++;
				System.out.println("¼Ó·¨  " + i);
				flag = false;
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

	}

	public void sub() {
		
		synchronized(this){
			if (!this.flag) {
				i--;
			System.out.println("¼õ·¨ " + i);
			flag = true;
		}
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		}
}

class Add implements Runnable {
	private ThreadDemo hd = null;

	public Add(ThreadDemo hd) {
		this.setHd(hd);
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			this.hd.add();
		}
	}

	public ThreadDemo getHd() {
		return hd;
	}

	public void setHd(ThreadDemo hd) {
		this.hd = hd;
	}
}

class Sub implements Runnable {
	ThreadDemo hd = null;

	public Sub(ThreadDemo hd) {
		this.hd = hd;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			this.hd.sub();
		}
	}
}

public class TesrDemo {

	public static void main(String[] args) {
		ThreadDemo hd = new ThreadDemo();
		Add a1 = new Add(hd);
		 Add a2 = new Add(hd);
		//
		 Sub s1 = new Sub(hd);
		Sub s2 = new Sub(hd);
		new Thread(a1).start();
		 new Thread(a2).start();

		new Thread(s1).start();
		new Thread(s2).start();

	}
}
