package test2;

class Syn implements Runnable{
	private int ticket = 20;
	@Override
	public void run() {
	for( int i = 0 ; i < 100 ; i++ ){
		synchronized(this){
			if(ticket>0){
				
			
				System.out.println(Thread.currentThread().getName()+"Ʊ��ʣ��--"+ticket--);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
	}
		
	}	
}

public class TestSynchronized {
	public static void main(String[] args) {
		Syn syn = new Syn();
		Thread t1 = new Thread(syn);
		Thread t2 = new Thread(syn);
		Thread t3 = new Thread(syn);
		Thread t4 = new Thread(syn);
		t1.setName("�߳�һ");
		t2.setName("�̶߳�");
		t3.setName("�߳���");
		t4.setName("�߳���");
		t1.setDaemon(true);
		
		t1.setPriority(10);
		t2.setPriority(9);
		t3.setPriority(8);
		t4.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
