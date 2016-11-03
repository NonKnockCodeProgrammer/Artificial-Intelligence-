package test;

class Person {
	private String name;
	private String address;
	private char sex;
	private int age;

	public Person() {

	}

	public Person(String name, String address, char sex, int age) {
		super();
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {

		return "姓名：" + this.name + "，地址：" + this.address + "，性别：" + this.sex
				+ "，年龄：" + this.age;
	}

}

class Student extends Person {

	private double math;
	private double english;

	public Student(){
		
	}
	
	public Student(String name,String address, char sex,int age,double math,double english){
		super(name,address,sex,age);
		this.math = math;
		this.english = english;	
	}
	
	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"数学成绩  "+math+"英语成绩 "+english;
	}

}

public class Test9 {
	public static void main(String args[]) {
		Student stu = new Student("张索尼","北京",'男',20,60,60);
		System.out.println(stu);
	
		}
}
