package test2;

class MyThread implements Runnable {
	private boolean flag=true;
	private int ticket = 1;

	public void run() {
		while (this.flag) {
			while (true) {

				synchronized (this) {
					if (ticket > 0) {

//						try {
//							Thread.sleep(300);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}

						System.out.println(ticket++);
					}
				}
			}
		}

	}
	public void Stop(){
		flag = false;
	}
}

public class StopDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		MyThread mt = new MyThread();

		Thread t = new Thread(mt);
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		Thread t4 = new Thread(mt);
		Thread t5 = new Thread(mt);
		Thread t6 = new Thread(mt);
		Thread t7 = new Thread(mt);
		Thread t8 = new Thread(mt);
		Thread t9= new Thread(mt);
		Thread t10 = new Thread(mt);
		Thread t11 = new Thread(mt);
		Thread t12= new Thread(mt);
		Thread t13 = new Thread(mt);
		t.setName("Ïß³ÌÒ»  -->>");
		t1.setName("Ïß³Ì¶ş  -->>");
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
//		t6.start();
//		t7.start();
//		t8.start();
//		t9.start();
//		t10.start();
//		t11.start();
//		t12.start();
//		t13.start();
//	t.start();
		t1.start();
		
		 t1.stop();
	}
}
