package demo1;

public class SleepInterrupt implements Runnable {

	private void printMs() {

	}

	public void run() {
		System.out.println(Thread.currentThread().getName()+" 在run（）方法中 - 接下来休眠5秒");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			System.out.println(Thread.currentThread().getName()+ " 000000000");
//		}
		System.out.println(Thread.currentThread().getName() 
				+ " 在run()方法中 - 休眠之后继续完成");
		System.out.println(Thread.currentThread().getName() 
				+ " 在run()方法中 - 继续运行");
		System.out.println(Thread.currentThread().getName() 
				+ " 在run()方法中 - 正常退出");
	}

	public static void main(String[] args) {

		SleepInterrupt s = new SleepInterrupt();
		Thread t = new Thread(s);
		t.setName("子线程-->> ");
		t.start();
		System.out.println(Thread.currentThread().getName() + "="+ t.isAlive());
		
		System.out.println(t.getName() +"="+ t.isAlive());
		
		// 在此休眠是为了确保程序能运行一会
		try {			
			System.out.println(Thread.currentThread().getName() 
					+ " 在main（）方法中 - 接下来休眠5秒");
			
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() 
				+ " 在 main()方法中 - 中断其它线程");
		t.interrupt();
		System.out.println(Thread.currentThread().getName() 
				+ " 在 main()方法中 - 退出");

	}
}
