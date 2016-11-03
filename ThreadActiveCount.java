package demo1;

public class ThreadActiveCount extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			printMsg();
		}
	}

	public void printMsg() { 
		// 获得运行此代码的线程的引用
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name = " + name);
	}
	public void printMsg1() { 
		// 获得运行此代码的线程的引用
		Thread t = Thread.currentThread();
		String name = t.getName();
		t.setName("aaaaaaaa");
		System.out.println("name = " + name);
	}
	public static void main(String args[]) {
		ThreadActiveCount tt = new ThreadActiveCount();		
		tt.start();		
		tt.setName("sssssssssss");// 在这里设置线程的名称
		System.out.println("线程的个数 "+tt.activeCount());
		for (int i = 0; i < 10; i++)

		{
			
			tt.printMsg1();
			
		}
	}
}