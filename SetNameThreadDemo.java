package demo1;

public class SetNameThreadDemo extends Thread {
	public void run(){
		for(int i=0;i<10;i++){
			PrintMsg();
		}
	}
	public  void PrintMsg(){
		//������д˴�����̵߳�����
		Thread t = new Thread();
		String name = t.getName();
		System.out.println("name = " +name);
	}
	public static void main(String args[]){
		SetNameThreadDemo tt = new SetNameThreadDemo();
		//�����������̵߳�����
		tt.setName("test thread ");
		tt.start();
		for(int i=0;i<10;i++){
			tt.PrintMsg();
		}
	}
}
