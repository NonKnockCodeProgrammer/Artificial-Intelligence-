package demo4;
class person implements Cloneable{
	String name;
	person(){
		
	}
	person(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();	
	}
	public String toString(){
		return "ÐÕÃû: "+getName();
	}
}

public class TestCloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		person p1 = new person("sss");
		person p2 =  p1;
		p2.setName("aaa");
		
		System.out.println(p2);
		System.out.println(p2.toString());
	}
}
