package test2;

class thread extends Thread{
	
	private int time;
	private String string;
	
	
	public thread(String string, int i) {
		this.string = string;
		this.time = i;
	
	}
	
	public thread() {
		// TODO Auto-generated constructor stub
	}

	public void run(){
		try {
			Thread.sleep(this.time);
			System.out.println(Thread.currentThread().getName()+this.time);
		} catch (InterruptedException e) {			
		}
	}
}
public class test {
	 public static void main(String[] args) {
		thread t = new thread();
		Thread tt = new Thread(t);
		
		tt.setName("aaa");
		tt.start();
		
		
		thread t1 = new thread("线程B",2000);
		thread t2 = new thread("线程C",3000);
		t.start();
		t1.start();
		t2.start();
	}
}