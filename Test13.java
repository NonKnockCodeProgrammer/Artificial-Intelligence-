package test1;

interface Fruit {
	public void eat();
}

class Apple implements Fruit {
	public void eat() {
		System.out.println(" ³ÔÆ»¹û ");
	}
}

class orange implements Fruit {
	public void eat() {
		System.out.println(" ³ÔéÙ×Ó ");
	}
}

class Factory {
	public static Fruit getInstance(String className) {
		Fruit f = null;
		if ("apple".equals(className)) {
			f = new Apple();
		}
		if ("orange".equals(className)) {
			f = new orange();
		}
		return f;
	}

}

public class Test13 {
	public static void main(String[] args) {
			Fruit f = null;
			f = Factory.getInstance("apple");
			f.eat();
	}
}
