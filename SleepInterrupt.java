package demo1;

public class SleepInterrupt implements Runnable {

	private void printMs() {

	}

	public void run() {
		System.out.println(Thread.currentThread().getName()+" ��run���������� - ����������5��");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			System.out.println(Thread.currentThread().getName()+ " 000000000");
//		}
		System.out.println(Thread.currentThread().getName() 
				+ " ��run()������ - ����֮��������");
		System.out.println(Thread.currentThread().getName() 
				+ " ��run()������ - ��������");
		System.out.println(Thread.currentThread().getName() 
				+ " ��run()������ - �����˳�");
	}

	public static void main(String[] args) {

		SleepInterrupt s = new SleepInterrupt();
		Thread t = new Thread(s);
		t.setName("���߳�-->> ");
		t.start();
		System.out.println(Thread.currentThread().getName() + "="+ t.isAlive());
		
		System.out.println(t.getName() +"="+ t.isAlive());
		
		// �ڴ�������Ϊ��ȷ������������һ��
		try {			
			System.out.println(Thread.currentThread().getName() 
					+ " ��main���������� - ����������5��");
			
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() 
				+ " �� main()������ - �ж������߳�");
		t.interrupt();
		System.out.println(Thread.currentThread().getName() 
				+ " �� main()������ - �˳�");

	}
}
