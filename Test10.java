package test1;

class Employee {
	private String name;
	private int age;
	private char sex;

	public Employee() {

	}

	public Employee(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

}

class Manager extends Employee {
	private String job;
	private double income;

	public Manager() {
	}

	public Manager(String name,int age,char sex,String job, double income) {
		super(name,age,sex);
		this.job = job;
		this.income = income;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"job  = " + job + "income  = " + income;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
}

class Staff extends Employee {
	private String dept;
	private double salary;

	public Staff() {
	}
	public Staff(String name,int age,char sex,String dept,double salary){
		super(name,age,sex);
		this.dept = dept;
		this.salary = salary;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"dept  = "+dept+"salary  = " +salary;
	}
}
public class Test10{
	public static void main(String[] args) {
		Staff ea = new Staff("ÕÅÈý",20,'ÄÐ',"×Ü¼à",20000);
		System.out.println(ea);
	}
}