package demo1;

public class SetNameThreadDemo extends Thread {
	public void run(){
		for(int i=0;i<10;i++){
			PrintMsg();
		}
	}
	public  void PrintMsg(){
		//获得运行此代码的线程的引用
		Thread t = new Thread();
		String name = t.getName();
		System.out.println("name = " +name);
	}
	public static void main(String args[]){
		SetNameThreadDemo tt = new SetNameThreadDemo();
		//在这里设置线程的名称
		tt.setName("test thread ");
		tt.start();
		for(int i=0;i<10;i++){
			tt.PrintMsg();
		}
	}
}
