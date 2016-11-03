package test2;

class Info1 {


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	private String name = "李兴华";
	private String content = "JAVA讲师";

	synchronized void set(String name, String content) {
		notify();

		this.setName(name);
		
		this.setContent(content);
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized void get() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		notify();
		System.out.println(this.getName() + "-->>" + this.getContent());
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class producer implements Runnable {

	private Info1 in = null;
	private boolean flag = false;

	public producer(Info1 in) {
		this.in = in;
	}

	@Override
	public void run() {
		for (int i = 0; i < 150; i++) {

			{
				

				if (flag) {

					in.set("李兴华", "JAVA讲师");
					flag = false;

				} else {

					in.set("MN", "www.mldn.com");
					flag = true;
				}

			}

		}
	}
}

class Consumer implements Runnable {

	private Info1 in = null;

	public Consumer(Info1 in) {
		this.in = in;
	}

	@Override
	public void run() {
		for (int i = 0; i < 150; i++) {
			try {
				new Thread(this).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			in.get();
		}
	}

}

public class TestThreadCaseDemo1 {
	public static void main(String[] args) {
		Info1 in = new Info1();
		producer pr = new producer(in);
		new Thread(pr).start();

		Consumer co = new Consumer(in);
		new Thread(co).start();

	}
}
