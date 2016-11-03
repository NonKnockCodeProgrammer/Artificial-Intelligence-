package test2;

class person {
	private String name;
	private int age;

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void p() {
		System.out.println(" name = " + name + " , age = " + age);
	}
	
	public boolean equals(Object obj){
		
		if(this == obj){
			return true;
		}if(!(obj instanceof person)){
			return false;
		}person pe = (person) obj;
		if(this.name.equals(pe.name)&&this.age == pe.age){
			return true;
		}else{
			return false;
		}
	}
}

public class TestEquals {
	public static void main(String[] args) {
		person p1 = new person("ss",20);
		person p2 =new person("ss",20);
		System.out.println(p1.equals(p2));
	}
}
