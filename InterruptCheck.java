package demo1;

public class InterruptCheck {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" -->>A: t.isInterrupted()= " + t.isInterrupted());
		t.interrupt();// �ж��߳�
		System.out.println(t.getName()+" -->>B: t.isInterrupted()= " + t.isInterrupted());
		System.out.println(t.getName()+" -->>C: t.isInterrupted()= " + t.isInterrupted());
		try {
			Thread.sleep(200);
			System.out.println("�߳�û�б��ж� ");
		} catch (InterruptedException e) {
			System.out.println("�̱߳��ж� ");
		}
		// ��Ϊ sleep �׳����쳣��������������жϱ�־
		System.out.println(t.getName()+" -->>D��t.isInterrupted() = " + t.isInterrupted());
	}
}
