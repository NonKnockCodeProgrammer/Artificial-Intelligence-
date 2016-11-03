package demo1;

class printt implements Runnable {
	int num = 1;

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				notify();
			
				if (num < 101) {
					System.out.println(Thread.currentThread().getName() + " "
							+ num);
					num++;
				} else {
					break;
				}
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}

public class TestThread {
	public static void main(String[] args) {
		printt p1 = new printt();
		// printt p2 = new printt();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p1);
		t1.setName("线程   1-->>");
		t2.setName("线程   2-->>");
		t1.start();
		t2.start();
	}
}