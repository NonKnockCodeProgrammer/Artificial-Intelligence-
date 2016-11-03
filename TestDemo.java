package test1;

class Message {
private int data = 10 ; // 初始值
private boolean flag = true;
public synchronized void add() { // 加法操作
if (this.flag == false) { // 已经生产过了，不能生产
try {
super.wait(); // 等待
} catch (InterruptedException e) {
e.printStackTrace();
}
}
try {
Thread.sleep(200);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("加法操作：" + this.data ++);
this.flag = false; // 已经生产完成，修改标志位
super.notify(); // 唤醒等待线程
}
public synchronized void subtract() { // 减法操作
if (this.flag == true) { // 未生产，不能取走
try {
super.wait(); // 等待
} catch (InterruptedException e) {
e.printStackTrace();
}
}
try {
Thread.sleep(100);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("减法操作：" + this.data --);
this.flag = true; // 已经取走了，可以继续生产
super.notify(); // 唤醒等待线程
}
// setter、getter略
}
class Addition implements Runnable { // 定义生产者

private Message msg = null ;
public Addition(Message msg) {
this.msg = msg ;
}
@Override
public void run() {
for (int x = 0; x < 50; x++) { // 加法执行50次
this.msg.add() ; // 加法操作
}
}
}
class Subtraction implements Runnable { // 定义消费者
private Message msg = null ;
public Subtraction (Message msg) {
this.msg = msg ;
}
@Override
public void run() {
for (int x = 0; x < 50; x++) { // 减法执行50次
this.msg.subtract() ; // 执行减法
}
}
}
public class TestDemo {
public static void main(String args[]) {
Message msg = new Message();
new Thread(new Addition(msg), "加法对象A").start(); // 启动线程
new Thread(new Addition(msg), "家访对象B").start(); // 启动者线程
new Thread(new Subtraction(msg), "减法对象A").start(); // 取得线程
new Thread(new Subtraction(msg), "减法对象B").start(); // 取得线程
}
}