package demo2;
class Person{
	private String name;
	Person(String name){
		this.name = name;
	}
	public String GetName(){
		
		return name;
	}
}
public class ObjectArayyDemo {
	public static void main(String[] args) {
		Person per[] = new Person[3];
		
		per[0] = new Person("sss");
		per[1] = new Person("aaa");
		per[2] = new Person("aaa");
		for( int i = 0 ; i < per.length ; i++ ){
			System.out.println(per[i].GetName());
		}
		
	}
}
