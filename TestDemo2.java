package test;

/*定义并测试一个代表员工的 Employee 类。员工属性包括“编号”、“姓名”、“基本薪水”、“薪水增长额”；还包括 “计
 算增长后的工资总额”。的操作方法*/

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
		return "编号 = " + this.empno + "\n" + "姓名 = " + this.name + "\n" + "工资 = " + this.sal
				+ "\n" + "工资增长 = " + this.rate + "\n";
	}
	

}

public class TestDemo2 {
	public static void main(String[] args) {
		Employee emp = new Employee(0002, "shell", 3000.0, 1.5);
		emp.growthin();
		System.out.println(emp.toString());
	}
}
