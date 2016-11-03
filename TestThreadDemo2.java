package test2;

class Info2 {
	private String name = "李兴华";
	private String content = "Java讲师";
	private boolean flag = false;

	public synchronized void set(String name, String content) {
		if (!flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.setName(name);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setContent(content);
		flag = false;
		super.notify();
	}

	synchronized void get() {

		if (flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + "-->>" + this.getContent());
		flag = true;
		super.notify();
	}

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

}

class peroducer1 implements Runnable {
	private Info2 in = null;

	public peroducer1(Info2 in2) {
		this.in = in2;
	}

	@Override
	public void run() {
		boolean flag = false;
		for (int i = 0; i < 20; i++) {
			if (flag) {
				this.in.set("李兴华", "JAVA讲师");
				
				flag = false;
			} else {
				this.in.set("mldn", "www.mldn.cn");
				flag = true;
			}
		}
	}

}

class Consumer1 implements Runnable {
	private Info2 in = null;

	public Consumer1(Info2 in2) {
		this.in = in2;
	}

	@Override
	public void run() {
		for( int i = 0 ; i < 20 ; i++ ){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.in.get();
		}


	}

}

public class TestThreadDemo2 {
	public static void main(String[] args) {
		Info2 in2 = new Info2();
		peroducer1 per1 = new peroducer1(in2);
		Consumer1 con1 = new Consumer1(in2);
		new Thread(per1).start();
		new Thread(con1).start();
	}
}
