package demo1;

import java.io.File;
import java.io.IOException;

import demo3.systemDemo;

//class P {
//	synchronized void funA(T t) {
//		String name = Thread.currentThread().getName();
//
//		System.out.println(name + " ����B.f00");
//
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
//		for (int i = 1; i < 11; i++) {
//			System.out.println(name + " " + i);
//		}
//	}
//}
//
//class T {
//	synchronized void funB(P p) {
//
//		String name = Thread.currentThread().getName();
//
//		System.out.println(name + " ����B.f00");
//
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
//
//		for (int i = 1; i < 11; i++) {
//			System.out.println(name + " " + i);
//		}
//	}
//}
//
//public class Test implements Runnable {
//
//	P p = new P();
//	T t = new T();
//
//	Test() {
//		Thread.currentThread().setName("���߳�-->>");// ���߳�
//
//		p.funA(t);
//
//		new Thread(this).start();
//	}
//
//	public void run() {
//
//		Thread.currentThread().setName("���߳� -->> ");
//
//		t.funB(p);
//	}
//
//	public static void main(String[] args) {
//		new Test();
//	}
//}


//public class Test {
//    public static void main(String[] args) {
//        int i = 10;
//        if (i < 5)
//            i = 50;
//        System.out.println("i="+i);
//    }
//} 


/**
 * @author Administrator
 *
 */


public class Test{
	public static void main(String[] args) {
		File file = new File ("c:"+File.separator+"text.txt");
		try {
			if(file.exists()){
				System.out.println("�ļ��Ѵ���");
			}else{
			file.createNewFile();
			}
		} catch (IOException e) {
			System.out.println("sssssss ");
		}
	}
}



