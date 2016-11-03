package test1;

class A {
	public  String name;
	private int age;
	public A(String name, int age) {
		this.setName(name);
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge(){
		return age;
	}

}

public class Test12 {

	class B extends A {
		private String sex;
		public B(String name,int age, String sex){
			super(name,age);
			this.sex = sex;
		}
		@Override
		public String toString() {
			
			return "name = "+name+"  ,sex = "+sex+"  ,age = "+getAge();
		}

	}

	public static void main(String[] args) {
		Test12 t = new Test12();
		Test12.B b = t.new B("ss",20,"ss");
		System.out.println(b.toString());
	}
}