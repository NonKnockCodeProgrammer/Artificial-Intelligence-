package test;

/*���岢����һ������Ա���� Employee �ࡣԱ�����԰�������š�������������������нˮ������нˮ������������� ����
 ��������Ĺ����ܶ���Ĳ�������*/

class Employee {

	private int empno;
	private String name;
	private double sal;
	private double rate;

	public Employee(int empno, String name, double sal, double rate) {
		super();
		this.empno = empno;
		this.name = name;
		this.sal = sal;
		this.rate = rate;
	}
	public void growthin(){
		sal = sal * rate;
	}
	@Override
	public String toString() {
		return "��� = " + this.empno + "\n" + "���� = " + this.name + "\n" + "���� = " + this.sal
				+ "\n" + "�������� = " + this.rate + "\n";
	}
	

}

public class TestDemo2 {
	public static void main(String[] args) {
		Employee emp = new Employee(0002, "shell", 3000.0, 1.5);
		emp.growthin();
		System.out.println(emp.toString());
	}
}
