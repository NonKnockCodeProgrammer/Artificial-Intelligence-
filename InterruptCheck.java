package demo1;

public class InterruptCheck {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" -->>A: t.isInterrupted()= " + t.isInterrupted());
		t.interrupt();// 中断线程
		System.out.println(t.getName()+" -->>B: t.isInterrupted()= " + t.isInterrupted());
		System.out.println(t.getName()+" -->>C: t.isInterrupted()= " + t.isInterrupted());
		try {
			Thread.sleep(200);
			System.out.println("线程没有被中断 ");
		} catch (InterruptedException e) {
			System.out.println("线程被中断 ");
		}
		// 因为 sleep 抛出了异常，所以它清除了中断标志
		System.out.println(t.getName()+" -->>D：t.isInterrupted() = " + t.isInterrupted());
	}
}
