package demo1;

public class ThreadJoin extends Thread {
	
	public void run(){
		String string = new String();
		int  x = 0;
		for( int i = 0 ; i < 10 ; i++ ){
			if(i==7){
				try {
					System.out.println(" Ïß³ÌÔÝÍ£2Ãë£¬ÇëÉÔµÈ¡£");
					Thread.currentThread().sleep(2000);
					//Thread.currentThread().setDaemon(true);
				} catch (InterruptedException e) {
					
				}
			}
			System.out.println(Thread.currentThread().getName()+"--->>"+x++);
		}
	}

	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin t = new ThreadJoin();
		Thread pp = new Thread(t);
		pp.start();
		pp.join();
		
		int p = 0;
		for( int i = 0 ; i < 10 ; i++ ){
			if(i==5){
				pp.join();
			}
			System.out.println(" main Thread  "+p++);
		}
		
	}
}
//class ThreadTest implements Runnable{
//	
//		public void run(){
//		String string = new String();
//		int  x = 0;
//		for( int i = 0 ; i < 10 ; i++ ){
//			if(i==7){
//				try {
//					System.out.println(" Ïß³ÌÔÝÍ£2Ãë£¬ÇëÉÔµÈ¡£");
//					Thread.currentThread().sleep(2000);
//					//Thread.currentThread().setDaemon(true);
//				} catch (InterruptedException e) {
//					
//				}
//			}
//			System.out.println(Thread.currentThread().getName()+"--->>"+x++);
//		}
//	}
//}