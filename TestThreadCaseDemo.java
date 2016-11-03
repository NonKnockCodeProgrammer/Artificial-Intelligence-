//package test2;
//
//class Info {
//	private String name ="李兴华" ;
//	private String content ="jAVA讲师";
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getContent() {
//		return content;
//	}
//
//	public void setContent(String content) {
//		this.content = content;
//	}
//}
//
//
//
//
//
//class Producer implements Runnable {
//	private Info info = null;
//
//	public Producer(Info info) {
//		this.info = info;
//	}
//
//	public void run() {
//		boolean flag = false;
//		for (int i = 0; i < 20; i++) {
//			if (flag) {
//				
//				this.info.setName("李兴华");
//				//System.out.println(Thread.currentThread().getName()+info);
//				try {
//					Thread.sleep(90);
//				} catch (InterruptedException e) {
//					
//					e.printStackTrace();
//				}
//				this.info.setContent("JAVA讲师");
//				//System.out.println(this.info.getContent());
//				flag = false;
//			} else {
//				this.info.setName("mldn");
//				try {
//					Thread.sleep(90);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				this.info.setContent("www.mldnjava.com");
//				flag = true;
//			}
//
//		}
//
//	}
//}
//
//class Consumer implements Runnable{
//	private Info info = null;
//	public Consumer(Info info){
//		this.info = info;
//	}
//	public void run(){
//		for( int i = 0 ; i < 20 ; i++ ){
//			try {
//				Thread .sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(this.info.getName()+"-->"
//			+this.info.getContent());
//		}
//	}
//} 
//
//public class TestThreadCaseDemo {
//	public static void main(String[] args) {
//		Info i = new Info();
//		Producer pro = new Producer(i);
//		Consumer con = new Consumer(i);
//		new Thread(pro).start();
//		new Thread(con).start();
//	}
//}
