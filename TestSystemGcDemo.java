package demo3;

class person{
	private String name;
	private int age;
	person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "name"+this.name+"age"+this.age;
	}
	public void finalze() throws Throwable{
		System.out.println("对象被释放--->>"+this);
	}
}

public class TestSystemGcDemo {
	public static void main(String[] args) {
		person p = new person("gg",20);
		p.toString();
		System.gc();
	}
}
