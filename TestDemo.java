package test1;

class Message {
private int data = 10 ; // ��ʼֵ
private boolean flag = true;
public synchronized void add() { // �ӷ�����
if (this.flag == false) { // �Ѿ��������ˣ���������
try {
super.wait(); // �ȴ�
} catch (InterruptedException e) {
e.printStackTrace();
}
}
try {
Thread.sleep(200);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("�ӷ�������" + this.data ++);
this.flag = false; // �Ѿ�������ɣ��޸ı�־λ
super.notify(); // ���ѵȴ��߳�
}
public synchronized void subtract() { // ��������
if (this.flag == true) { // δ����������ȡ��
try {
super.wait(); // �ȴ�
} catch (InterruptedException e) {
e.printStackTrace();
}
}
try {
Thread.sleep(100);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("����������" + this.data --);
this.flag = true; // �Ѿ�ȡ���ˣ����Լ�������
super.notify(); // ���ѵȴ��߳�
}
// setter��getter��
}
class Addition implements Runnable { // ����������

private Message msg = null ;
public Addition(Message msg) {
this.msg = msg ;
}
@Override
public void run() {
for (int x = 0; x < 50; x++) { // �ӷ�ִ��50��
this.msg.add() ; // �ӷ�����
}
}
}
class Subtraction implements Runnable { // ����������
private Message msg = null ;
public Subtraction (Message msg) {
this.msg = msg ;
}
@Override
public void run() {
for (int x = 0; x < 50; x++) { // ����ִ��50��
this.msg.subtract() ; // ִ�м���
}
}
}
public class TestDemo {
public static void main(String args[]) {
Message msg = new Message();
new Thread(new Addition(msg), "�ӷ�����A").start(); // �����߳�
new Thread(new Addition(msg), "�ҷö���B").start(); // �������߳�
new Thread(new Subtraction(msg), "��������A").start(); // ȡ���߳�
new Thread(new Subtraction(msg), "��������B").start(); // ȡ���߳�
}
}