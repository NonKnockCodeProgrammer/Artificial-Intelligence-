package demo1;

public class ThreadActiveCount extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			printMsg();
		}
	}

	public void printMsg() { 
		// ������д˴�����̵߳�����
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name = " + name);
	}
	public void printMsg1() { 
		// ������д˴�����̵߳�����
		Thread t = Thread.currentThread();
		String name = t.getName();
		t.setName("aaaaaaaa");
		System.out.println("name = " + name);
	}
	public static void main(String args[]) {
		ThreadActiveCount tt = new ThreadActiveCount();		
		tt.start();		
		tt.setName("sssssssssss");// �����������̵߳�����
		System.out.println("�̵߳ĸ��� "+tt.activeCount());
		for (int i = 0; i < 10; i++)

		{
			
			tt.printMsg1();
			
		}
	}
}